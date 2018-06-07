package br.com.basell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.naming.InitialContext;
import javax.sql.DataSource;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC, use=SOAPBinding.Use.LITERAL, parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public class BasellService {
    private static final Logger log = Logger.getLogger("BasellService.class");

    @WebMethod(action="getSaldoDisponivel")
    @WebResult(name="result")
    public Float getSaldoDisponivel(@WebParam(name="matricula") String matricula, @WebParam(name="evento") String evento, @WebParam(name="mes") String mes) {
        Float f;
        block32 : {
            f = new Float(-1.0f);
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            log.info("update");
            try {
                try {
                    InitialContext context = new InitialContext();
                    DataSource ds = (DataSource)context.lookup("jdbc/webdeskDS");
                    String sql = "select saldo from rh_saldo_funcionario ";
                    sql = String.valueOf(sql) + " where matricula = '" + matricula + "' ";
                    sql = String.valueOf(sql) + "   and codigoEvento = '" + evento + "'";
                    sql = String.valueOf(sql) + "   and mesCompetencia = '" + mes + "'";
                    con = ds.getConnection();
                    con.setAutoCommit(false);
                    log.info(sql);
                    log.info(con.toString());
                    st = con.prepareStatement(sql);
                    log.info("prepareStatement");
                    rs = st.executeQuery(sql);
                    log.info("passou");
                    while (rs.next()) {
                        f = Float.valueOf(rs.getFloat("saldo"));
                    }
                    log.info("f:" + f);
                    st.close();
                    con.commit();
                }
                catch (Exception e) {
                    if (con != null) {
                        try {
                            con.rollback();
                        }
                        catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    }
                    if (rs != null) {
                        try {
                            rs.close();
                        }
                        catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    }
                    if (st != null) {
                        try {
                            st.close();
                        }
                        catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    }
                    if (con == null) break block32;
                    try {
                        con.close();
                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }
            finally {
                if (rs != null) {
                    try {
                        rs.close();
                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
                if (st != null) {
                    try {
                        st.close();
                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
        return f;
    }

    @WebMethod(action="gravaSaldo")
    @WebResult(name="result")
    public void gravaSaldo(@WebParam(name="matricula") String matricula, @WebParam(name="evento") String evento, @WebParam(name="mes") String mes, @WebParam(name="valor") Float valor) {
        block24 : {
            BasellService bs = new BasellService();
            Float f = bs.getSaldoDisponivel(matricula, evento, mes);
            String sql = "insert into rh_saldo_funcionario (matricula, codigoEvento, mesCompetencia, saldo)";
            sql = String.valueOf(sql) + " values('" + matricula + "', '" + evento + "', '" + mes + "', " + valor + ")";
            if (f.floatValue() != -1.0f) {
                sql = "update rh_saldo_funcionario set saldo = " + valor + " where ";
                sql = String.valueOf(sql) + " matricula = '" + matricula + "' and codigoEvento = '" + evento + "' and mesCompetencia = '" + mes + "'";
            }
            Connection con = null;
            Statement st = null;
            log.info("update");
            try {
                try {
                    InitialContext context = new InitialContext();
                    DataSource ds = (DataSource)context.lookup("jdbc/webdeskDS");
                    con = ds.getConnection();
                    con.setAutoCommit(false);
                    log.info(sql);
                    log.info(con.toString());
                    st = con.prepareStatement(sql);
                    log.info("prepareStatement");
                    int i = st.executeUpdate(sql);
                    log.info("passou");
                    st.close();
                    con.commit();
                }
                catch (Exception e) {
                    if (con != null) {
                        try {
                            con.rollback();
                        }
                        catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    }
                    if (st != null) {
                        try {
                            st.close();
                        }
                        catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    }
                    if (con == null) break block24;
                    try {
                        con.close();
                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }
            finally {
                if (st != null) {
                    try {
                        st.close();
                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }

    @WebMethod(action="adicionaSaldo")
    @WebResult(name="result")
    public void adicionaSaldo(@WebParam(name="matricula") String matricula, @WebParam(name="evento") String evento, @WebParam(name="mes") String mes, @WebParam(name="valor") Float valor) {
        block23 : {
            BasellService bs = new BasellService();
            Float f = bs.getSaldoDisponivel(matricula, evento, mes);
            String sql = "update rh_saldo_funcionario set saldo = saldo + " + valor + " where ";
            sql = String.valueOf(sql) + " matricula = '" + matricula + "' and codigoEvento = '" + evento + "' and mesCompetencia = '" + mes + "'";
            Connection con = null;
            Statement st = null;
            log.info("update");
            try {
                try {
                    InitialContext context = new InitialContext();
                    DataSource ds = (DataSource)context.lookup("jdbc/webdeskDS");
                    con = ds.getConnection();
                    con.setAutoCommit(false);
                    log.info(sql);
                    log.info(con.toString());
                    st = con.prepareStatement(sql);
                    log.info("prepareStatement");
                    int i = st.executeUpdate(sql);
                    log.info("passou");
                    st.close();
                    con.commit();
                }
                catch (Exception e) {
                    if (con != null) {
                        try {
                            con.rollback();
                        }
                        catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    }
                    if (st != null) {
                        try {
                            st.close();
                        }
                        catch (SQLException e1) {
                            e1.printStackTrace();
                        }
                    }
                    if (con == null) break block23;
                    try {
                        con.close();
                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }
            finally {
                if (st != null) {
                    try {
                        st.close();
                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }
}