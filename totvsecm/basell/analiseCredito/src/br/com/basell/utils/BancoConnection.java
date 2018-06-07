package br.com.basell.utils;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BancoConnection {
	private static String dataSource = "jdbc/webdeskDS";

	public Connection getConnection() {
		Connection conn = null;
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup(dataSource);
			conn = ds.getConnection();
		} catch (NamingException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}