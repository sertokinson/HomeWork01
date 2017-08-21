import java.util.Scanner;

public class Task2018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum =scanner.nextInt();
        int k = 0;
        boolean f = true;
        for (int i = 2; i <= n; i++) {
            int a = scanner.nextInt();
            if (k == 0) {
                k = i-1;
                if(!f) f=true;
                else
                f = false;
            } else {
                k--;
            }
            if (f)
                sum += a;
            else sum -= a;
        }
        System.out.println(sum);
    }
}
