import java.util.Scanner;

public class Task2024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        int count = 0;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length/2; i++) {
            if (a[i] != a[a.length - i-1]) {
                count++;
            }
        }
        System.out.println(count);

    }

}