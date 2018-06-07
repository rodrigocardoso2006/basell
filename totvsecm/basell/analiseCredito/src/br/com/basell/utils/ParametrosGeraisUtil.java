package br.com.basell.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParametrosGeraisUtil extends BancoConnection {
    public String getUrl() {
        String r = "";
        Connection conn = this.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT pasta_fisica_upload FROM param_geral";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                r = rs.getString("pasta_fisica_upload");
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