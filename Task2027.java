import java.util.Scanner;

public class Task2027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        replaceMass(a);
        replaceMass(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void replaceMass(int[] a) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int[] b;
        b = new int[a.length];
        int j = l - 1;
        for (int i = r - 1; i >= l - 1; i--) {
            b[j] = a[i];
            j++;
        }
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0)
                b[i] = a[i];
            a[i] = b[i];
        }

    }
}