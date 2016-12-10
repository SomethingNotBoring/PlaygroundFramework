import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws SQLException {
		long start = System.currentTimeMillis();
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://somethingnotboring.database.windows.net:1433;database=nur;user=snb@somethingnotboring;password=rootroot1$;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
		System.out.println("Connected");
		long time = System.currentTimeMillis() - start;
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("SELECT TOP (1000) tag_desc FROM Deficiencies");
		while (rs.next()) {
		    System.out.println(rs.getString(1));
		}
		
		System.out.println(time);
		System.out.println(System.currentTimeMillis() - time - start);
	}
}
