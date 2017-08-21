import java.util.Scanner;

public class Task2016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a == 0) && (b == 0) && (c == 0)) System.out.println(-1);
        else if(a!=0) {
            if (((b * b) - (4 * a * c)) > 0) System.out.println(2);
            if (((b * b) - (4 * a * c)) == 0) System.out.println(1);
            if (((b * b) - (4 * a * c)) < 0) System.out.println(0);
        }
        else if(b==0) System.out.println(0);
        else System.out.println(1);
    }
}
