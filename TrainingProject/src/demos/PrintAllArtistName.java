package demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrintAllArtistName {
	public static final String DATABASE_URL = "jdbc:sqlite:M:\\eclipse_workspace\\sqlite\\Chinook_Sqlite.sqlite";
	public static final String SELECT_NAMES = "SELECT Name FROM Artist";
	
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection(DATABASE_URL);
		
		Scanner input = new Scanner(System.in);
		String name =input.nextLine();
		
		PreparedStatement statement = connection.prepareStatement(SELECT_NAMES);
		ResultSet results = statement.executeQuery();
		
		while (results.next()) {
		System.out.println(results.getString("Name"));
		
		results.close();
		statement.close();
		input.close();
		connection.close();
		
		
		}
		
		
	}

}
