import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Registration extends JDialog {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPanel MainPanel;
    private JButton registerButton;
    private JButton cancelButton;
    private JLabel name;

    public Registration(JFrame parent) {
        super(parent);
        setVisible(true);
        setSize(300,400);
        setContentPane(MainPanel);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    private void registerUser() {
    String Name = textField1.getText();
    String Mail = textField2.getText();
    String Phone = textField3.getText();
    String Password = String.valueOf(textField4.getText());
    String ConfirmPassword = String.valueOf(textField5.getText());

    if(Name.isEmpty() || Password.isEmpty()|| Mail.isEmpty()|| Phone.isEmpty()) {
        JOptionPane.showMessageDialog(this,"Fill All","Try",JOptionPane.ERROR_MESSAGE);
        return;
    }
    if(!Password.equals(ConfirmPassword)) {
        JOptionPane.showMessageDialog(this,"Password not same","Try",JOptionPane.ERROR_MESSAGE);
        return;
    }
    user = addUserToDB(Name,Mail,Phone,Password);
    if(user!=null) {
        dispose();
    } else {
        JOptionPane.showMessageDialog(this,"Registration Failed","Try later",JOptionPane.ERROR_MESSAGE);
    }
    }
    public User user;
    private User addUserToDB(String name, String mail, String phone, String password) {
        User user = new User();
        String URL = "jdbc:postgresql://localhost:5432/Company";
        String USERNAME = "postgres";
        String Pass = "1234";
        try {
            Connection conn = DriverManager.getConnection(URL,USERNAME,Pass);
            Statement stmt = conn.createStatement();
            String sql = "insert into users (Name,Mail,Phone,Password)"+"values(?,?,?,?)";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1,name);
            ps.setString(2,mail);
            ps.setString(3,phone);
            ps.setString(4,password);

            int addRows = ps.executeUpdate();
            if(addRows > 0) {
                user.Name = name;
                user.Mail = mail;
                user.Phone = phone;
                user.Password = password;

            }
            JOptionPane.showMessageDialog(this,"Registration done");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }


    public static void main(String[] args) {
        Registration r = new Registration(null);
        User user = r.user;

    }
}
