import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main (String [] args) throws IOException
    {
        System.out.println("Введіть кут:");
        Scanner scanner = new Scanner(System.in);
        String a = String.valueOf(scanner.nextDouble());

        double angle = Double.parseDouble(a);
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);

        System.out.println("Кут: " + angle);
        System.out.println("Синус: " + sin);
        System.out.println("Косинус: " + cos);
    }
}
