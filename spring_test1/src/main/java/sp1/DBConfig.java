package sp1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	public static Connection dbinfo() throws Exception {
		String db_driver = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3306/web";
		String db_user = "hong";
		String db_pass = "1234";
		Class.forName(db_driver);
		Connection con = DriverManager.getConnection(db_url, db_user, db_pass);
		return con;
	}
}