import java.util.Scanner;

public class Task2019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = 0;
        int i = 0;
        int number = 0;
        while (f == 0) {
            i++;
            for (int j = 1; j <= i; j++) {
                number++;
                if (number == n) {
                    f = 1;
                    System.out.println(i);
                }
            }
        }

    }
}