import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class ConnectDB
	{
		
	
	static Connection connection = null ;
	static String databaseName = "";
	static String url = "jdbc:mysql://localhost:3306/" +databaseName;
	
	
	static String username = "root";
	static String password = "90108802";
	
	
	
	public static void main(String[]args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		connection = DriverManager.getConnection(url, username, password);
		PreparedStatement ps =connection.prepareStatement("INSERT INTO `studentdatabase`.`student` (`name`) VALUES ('ak koli');");
		
		int status = ps.executeUpdate();
		
		if (status !=0)
		{
			System.out.println("Database was Connected!!!!!");
			System.out.println("Record was Inserted Successfully");
		}
	
	}
	}

