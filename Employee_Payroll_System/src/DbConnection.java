import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	private Connection con;
	private Statement st;

	public DbConnection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "MyNewPass");
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void showAllEmp(String sql) {
		try {
			ResultSet rs  = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addEmployee(String sql) {
		try {
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteByID(String sql) {
		try {
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
