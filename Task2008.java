import java.util.Scanner;

public class Task2008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (sum + a <= w) {
                sum += a;
                count++;
            }

        }

        System.out.println(count + " " + sum);
    }
}