import java.util.Scanner;

public class Task2009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int sum = a;
        int k = 1;
        for (int i = 2; i <= n; i++) {
            a = scanner.nextInt();
            if(i==(int)Math. pow(2, k)){
                sum += a;
                k++;
            }

        }

        System.out.println(sum);
    }
}