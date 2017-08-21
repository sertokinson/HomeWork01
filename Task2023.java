import java.util.Scanner;

public class Task2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        int[] c;
        a = new int[n];
        c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b;
        b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                    break;
                }
            }
        }
        if (c != null) {
            System.out.println(k);
            for (int i = 0; i < c.length; i++) {
                if(c[i]!=0) System.out.print(c[i] + " ");
            }
        } else System.out.println(0);
    }

}

