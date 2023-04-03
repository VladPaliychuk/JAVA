import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть довжину першого катету: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть довжину другого катету: ");
        double b = scanner.nextDouble();

        double c = Math.hypot(a, b);
        double alpha = Math.toDegrees(Math.asin(a / c));
        double beta = Math.toDegrees(Math.asin(b / c));

        System.out.printf("Кут при першому катеті: %.2f градусів%n", alpha);
        System.out.printf("Кут при другому катеті: %.2f градусів%n", beta);
    }
}
