import java.util.Scanner;

public class Task2003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        boolean f = true;
        for (int i = 0; i < n; i++) {
            if (f) {
                sum += scanner.nextInt();
                f = false ;
            }
            else{
                sum -= scanner.nextInt();
                f = true;
            }


        }

        System.out.println(sum);
    }
}