import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String query = "DELETE FROM STUDENTS WHERE id=3";
        String url = "jdbc:postgresql://localhost:5432/Student";
        String username = "postgres";
        String password = "1234";

        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();

        int inserted = stmt.executeUpdate(query);

        System.out.println("values deleted");
        stmt.close();
        conn.close();
    }
}
