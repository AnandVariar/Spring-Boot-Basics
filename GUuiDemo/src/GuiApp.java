import javax.swing.*;
import java.awt.*;

public class GuiApp {
    public static void main(String[] args) {
        Demo obj = new Demo();
    }
}

 class Demo extends JFrame
{


    JTextField t1,t2;
    JButton b1;
    JButton b2;
    JLabel l;
    private JTextField textName;
    private JButton btnClick;

    public Demo() {

        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("add");
        b2=new JButton("sub");
        l=new JLabel("result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);


        b1.addActionListener(al->
        {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int value=num1+num2;
                l.setText(value+"");
            }
        );
        b2.addActionListener(e->
                {
                    int num1=Integer.parseInt(t1.getText());
                    int num2=Integer.parseInt(t2.getText());
                    int value=num1-num2;
                    l.setText(value+"");
                }
        );
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }


}
