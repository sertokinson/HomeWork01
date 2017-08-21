import java.util.Scanner;

public class Task2032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b;
        b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        int x = a[n - 1];
        int y = b[m - 1];
        int p = 1;
        for (int i = n - 2; i >= 0; i--) {
            p *= 10;
            x += a[i] * p;
        }
        p = 1;
        for (int i = m - 2; i >= 0; i--) {
            p *= 10;
            y += b[i] * p;
        }
        if (x < y) System.out.println(-1);
        else if (x == y) System.out.println(0);
        else System.out.println(-1);
    }
}