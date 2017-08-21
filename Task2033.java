import java.util.Scanner;

public class Task2033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int x = a[n - 1];
        int p = 1;
        for (int i = n - 2; i >= 0; i--) {
            p *= 10;
            x += a[i] * p;
        }
        x=x+1;
        System.out.println(x);
        for(int i=n-1;i>=0;i--){
            a[i]=x%10;
            x=x/10;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}