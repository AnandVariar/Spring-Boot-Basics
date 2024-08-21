import java.sql.*;

public class Demo {

    public Users users;

    private Users addtoDB(String name, String mail, String password) {
        Users users = new Users();
        String URL = "jdbc:postgresql://localhost:5432/Student";
        String USERNAME = "postgres";
        String Pass = "1234";

        String sql = "INSERT INTO students (Name, Email, Password) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, Pass);
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, mail);
            ps.setString(3, password);

            int addRows = ps.executeUpdate();
            if (addRows > 0) {
                users.Name = name;
                users.Email = mail;
                users.Password = password;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Users user = demo.addtoDB("John Doe", "john.doe@example.com", "password123");

        if (user != null) {
            System.out.println("User added to DB:");
            System.out.println("Name: " + user.Name);
            System.out.println("Email: " + user.Email);
        } else {
            System.out.println("Failed to add user to DB.");
        }
    }
}
