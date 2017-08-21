import java.util.Scanner;

public class Task2010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Nod(a, b);
    }

    public static void Nod(int a, int b) {
        int count = 0;
        if (a != 0 && b != 0) count = 1;
        while (a != b) {
            count++;
            if (a > b)
                a = a - b;
            else b = b - a;
        }
        System.out.println(count + " " + a);
    }
}
