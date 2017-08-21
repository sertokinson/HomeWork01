import java.util.Scanner;

public class Task2006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = a / 3;
        int f = 0;
        if (a % 3 == 2) d += 1;
        if (d >= 12) {
            f = d / 12;
            d = d % 12;
        }
        System.out.println(f + " " + d);
    }
}