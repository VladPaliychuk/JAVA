import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Task1 extends JFrame {
    JTextField input1 = new JTextField(10);
    JTextField input2 = new JTextField(10);
    JLabel text1 = new JLabel("Input");
    JLabel text2 = new JLabel("Output");
    JButton btn = new JButton("Copy");
    JButton btn2 = new JButton("Print list");
    ArrayList<String> list = new ArrayList<>();
    Task1() {
        super("Слухачі (listeners) полів та кнопок");
        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
            ;
        }
        catch(Exception e) {
        }
        setSize(300, 150);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.add(text1, BorderLayout.WEST);
        panel1.add(input1, BorderLayout.EAST);

        panel2.add(text2, BorderLayout.WEST);
        panel2.add(input2, BorderLayout.EAST);

        panel3.add(btn, BorderLayout.WEST);
        panel3.add(btn2, BorderLayout.EAST);

        Container c = getContentPane();
        c.add(panel1, BorderLayout.NORTH);
        c.add(panel2, BorderLayout.CENTER);
        c.add(panel3, BorderLayout.SOUTH);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String text = input1.getText();
                list.add(text);
                input2.setText(input1.getText());
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("List: ");
                for(String text : list){
                    System.out.println(text);
                }
            }
        });

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Task1();
    }
}
