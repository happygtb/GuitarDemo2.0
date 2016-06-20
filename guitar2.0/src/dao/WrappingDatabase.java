package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WrappingDatabase {
	private String DBDriver = "org.sqlite.JDBC";
	private String database = "jdbc:sqlite://g:/guitar.db";
	public Connection conn = null;
	public ResultSet rs = null;
		
	public ResultSet query(String mySql) throws Exception {
		try {
			Class.forName(DBDriver);
			conn = DriverManager.getConnection(database);
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(mySql);
			/*stmt.close();
			conn.close();*/
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库查询异常："+e.getMessage());
		}
		return null;
	}

	public void update(String mySql) throws Exception {
		try {
			Class.forName(DBDriver);
			conn = DriverManager.getConnection(database);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(mySql);
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库更新异常："+e.getMessage());
		}
	}
	
	public void setDBDriver(String DBDriver) {
		this.DBDriver = DBDriver;
	}

	public String getDBDriver() {
		return DBDriver;
	}
	
	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}
}

