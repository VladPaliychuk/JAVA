import java.lang.*;
public class Task1 {
    public static void main(String[] args) {
        double angle = 30.0;
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);

        System.out.println("Синус з " + angle + " градусів дорівнює " + sin);
        System.out.println("Косинус з " + angle + " градусів дорівнює " + cos);
    }
}
