import java.awt.*;
import javax.swing.*;

public class Task1 {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200);
        f.setVisible(true);

        JPanel p = new JPanel();
        f.add(p);

        p.setLayout(new FlowLayout());

        p.add(new JLabel("Login:"));
        p.add(new JTextField(10));
        p.add(new JLabel("Password:"));
        p.add(new JTextField(10));
        p.add(new JButton("OK"));
        p.add(new JButton("Cancel"));
    }
}
