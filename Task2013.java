import java.util.Scanner;

public class Task2013 {
    public static void main(String[] args) {
        int[] a;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        a = new int[n];
        int count=0;
        a[0] = scanner.nextInt();
        int min = a[0];
        for (int i = 1; i < n; i++) {
            a[i] = scanner.nextInt();
            if (min > a[i])
                min = a[i];
        }
        for (int i = 0; i < n; i++) {
            if(min==a[i]) count++;
        }
        System.out.println(count);
        }
    }
