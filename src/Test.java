import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	private static final String REPO_PATH = "C:/Users/user/Documents/Development/SomethingNotBoring/Workspace/PlaygroundFramework";
	private static final String DATABASE_PATH = "/nhc_db/DataMedicareGov_20161101.mdb";
	
	public static void main(String[] args) throws SQLException {
		Connection conn=DriverManager.getConnection(
		        "jdbc:ucanaccess://" + REPO_PATH + DATABASE_PATH);
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("SELECT tag_desc FROM Deficiencies");
		while (rs.next()) {
		    System.out.println(rs.getString(1));
		}
	}
}
