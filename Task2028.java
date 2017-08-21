import java.util.Scanner;

public class Task2028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        a = new int[n];
        int[] b;
        b = new int[5];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            maxMass(a);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) b[i]++;
            }
        }
        for (int i = 0; i < 5; i++) {
            if(b[i]!=0){
                System.out.println(i+" "+b[i]);
            }
        }
    }

    public static void maxMass(int[] a) {
        int x;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                x = a[i];
                a[i] = a[i + 1];
                a[i + 1] = x;
            }
        }
    }
}