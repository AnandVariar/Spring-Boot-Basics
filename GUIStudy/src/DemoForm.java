import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoForm extends JFrame {

    private JTextField textField;
    private JButton btn;
    private JPanel MainPanel;

    public DemoForm() {
        this.textField = textField;
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btn,textField.getText()+"heyyy");
            }
        });
    }

    public static void main(String[] args) {
        DemoForm df = new DemoForm();
        df.setVisible(true);
        df.setSize(300,400);
        df.setContentPane(df.MainPanel);
    }
}
