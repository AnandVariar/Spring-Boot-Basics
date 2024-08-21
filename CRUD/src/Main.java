import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String query = "UPDATE EMP SET name='Adam John' WHERE id=4";
        String url = "jdbc:postgresql://localhost:5432/Student";
        String password = "1234";
        String username = "postgres";
        Connection conn = DriverManager.getConnection(url,username,password);

        Statement stmt = conn.createStatement();

        int rs = stmt.executeUpdate(query);

        System.out.println("value updated");
    }
}