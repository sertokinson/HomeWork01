import java.util.Scanner;

public class Task2007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;
        int max = 0;
        while (a != 1) {
            if (a % 2 == 0) count++;
            else count = 0;
            if (count > max) max = count;
            a = a / 2;
        }
        System.out.println(max);
    }
}
