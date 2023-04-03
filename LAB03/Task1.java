import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.println("Введіть кількість символів для генерації!");
            return;
        }
        int numSymbols = Integer.parseInt(args[0]);

        for (int i = 0; i < numSymbols; i++) {
            char c = (char)(Math.random() * 26 + 'a');
            System.out.print(c + ": ");
            switch (c) {
                case 'a': case 'e': case 'i':
                case 'o': case 'u':
                    System.out.println("гласная");
                    break;
                case 'y': case 'w':
                    System.out.println("иногда гласная");
                    break;
                default:
                    System.out.println("согласная");
                    break;
            }
        }
    }
}
