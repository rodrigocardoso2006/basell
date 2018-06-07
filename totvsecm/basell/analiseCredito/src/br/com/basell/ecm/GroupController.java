package br.com.basell.ecm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.basell.entity.Group;
import br.com.basell.utils.BancoConnection;

public class GroupController extends BancoConnection {
    public List<Group> getGroupList() {
        ArrayList<Group> r = new ArrayList<Group>();
        Connection conn = this.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select codigo, descricao from v_grupo";
        System.out.println("SQL:" + sql);
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Group g = new Group();
                g.setCode(rs.getString("codigo"));
                g.setDescription(rs.getString("descricao"));
                r.add(g);
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