import java.util.Scanner;

public class Task2005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = scanner.nextInt();
        int k = 1;
        for (int i = 1; i < n; i++) {
            int b = scanner.nextInt();
            if (min > b) {
                min = b;
                k = i+1;
            }
        }

        System.out.println(k);
    }
}