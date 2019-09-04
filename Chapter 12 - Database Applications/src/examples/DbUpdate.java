package examples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUpdate {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = DbConnect.connectToDb();
				Statement statement = connection
						.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet = statement
						.executeQuery("SELECT * FROM contact WHERE firstName=\"Bouchra\"")) {
			System.out.println("Before the update");
			System.out.println("id \tfName \tlName \temail \t\tphoneNo");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t" 
						+ resultSet.getString("firstName") + "\t"
						+ resultSet.getString("lastName") + "\t" 
						+ resultSet.getString("email") + "\t"
						+ resultSet.getString("phoneNo"));
			}
			resultSet.absolute(1);
			resultSet.updateString("phoneNo", "+491");
			resultSet.updateRow();
			System.out.println("After the update");
			System.out.println("id \tfName \tlName \temail \t\tphoneNo");
			resultSet.beforeFirst();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t" 
						+ resultSet.getString("firstName") + "\t"
						+ resultSet.getString("lastName") + "\t" 
						+ resultSet.getString("email") + "\t"
						+ resultSet.getString("phoneNo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
