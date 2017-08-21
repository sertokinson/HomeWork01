import java.util.Scanner;

public class Task2021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        doubleMax(a);
        doubleMax(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void doubleMax(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) max = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) a[i] = a[i] / 2;
        }
    }
}
