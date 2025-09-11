import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = new Scanner(System.in)  .nextInt();
        int y = new Scanner(System.in)  .nextInt();
        double b = (double) x / y;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(b);
    }
}