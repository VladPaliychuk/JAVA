import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class DoubleVector {
    private double[] vector = null;
    public DoubleVector(double[] vector){
        this.vector = vector;
    }
    // Скалярний добуток векторів
    public double mult(DoubleVector anotherVector){
        double s = 0;
        for ( int i = 0; i < vector.length; i++ ){
            s += vector[i] * anotherVector.vector[i];
        }
        return s;
    }
    public static double mult(DoubleVector a, DoubleVector b){
        return a.mult(b);
    }
    public double add(DoubleVector anotherVector) {
        double s = 0;
        for (int i = 0; i < vector.length; i++) {
            s += vector[i] + anotherVector.vector[i];
        }
        return s;
    }
    public double subtract(DoubleVector anotherVector) {
        double s = 0;
        for (int i = 0; i < vector.length; i++) {
            s += vector[i] - anotherVector.vector[i];
        }
        return s;
    }
    public static double substract(DoubleVector a, DoubleVector b){
        return a.subtract(b);
    }
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {}

        double[] a = {1, 2, 3, 4};
        double[] b = {1, 1, 1, 1};
        double[] c = {2, 2, 2, 2};

        JFrame f = new JFrame("Double Vector");
        f.setSize(500,300);

        Container panel = new Container();
        panel.setLayout(new FlowLayout());

        DoubleVector v1 = new DoubleVector(a);
        DoubleVector v2 = new DoubleVector(b);
        DoubleVector v3 = new DoubleVector(c);

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        label1.setText("v1*v2=" + v1.mult(v2));
        label2.setText("v1+v2=" + v1.add(v2));
        label3.setText("v2-v3=" + DoubleVector.substract(v2, v3));

        f.add(panel);

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        f.setVisible(true);

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        f.addWindowListener(wndCloser);
        f.setVisible(true);
    }
}
