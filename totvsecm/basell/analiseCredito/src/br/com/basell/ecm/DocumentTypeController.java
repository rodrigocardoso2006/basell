package br.com.basell.ecm;

import br.com.basell.entity.DocumentType;
import br.com.basell.utils.BancoConnection;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DocumentTypeController
extends BancoConnection {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<DocumentType> getDocumentTypeList() {
        ArrayList<DocumentType> r = new ArrayList<DocumentType>();
        Connection conn = this.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select codigo, nome, pendente, provisorio, obrigatorio, renovacao from v_tipo_doc";
        System.out.println("SQL:" + sql);
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                DocumentType t = new DocumentType();
                t.setCode(rs.getString("codigo"));
                t.setDescription(rs.getString("nome"));
                System.out.println("LOG:" + Boolean.parseBoolean(rs.getString("obrigatorio")));
                if (rs.getInt("obrigatorio") == 1) {
                    t.setMandatory(Boolean.valueOf(true));
                } else {
                    t.setMandatory(Boolean.valueOf(false));
                }
                if (rs.getInt("pendente") == 1) {
                    t.setPending(Boolean.valueOf(true));
                } else {
                    t.setPending(Boolean.valueOf(false));
                }
                if (rs.getInt("provisorio") == 1) {
                    t.setProvisory(Boolean.valueOf(true));
                } else {
                    t.setProvisory(Boolean.valueOf(false));
                }
                if (rs.getInt("renovacao") == 1) {
                    t.setRenovation(Boolean.valueOf(true));
                } else {
                    t.setRenovation(Boolean.valueOf(false));
                }
                r.add(t);
            }
            conn.close();
        }
        catch (SQLException se) {
            se.printStackTrace();
        }
        finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            }
            catch (Exception se) {}
        }
        return r;
    }
}