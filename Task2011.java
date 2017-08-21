import java.util.Scanner;

public class Task2011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m;
        if (n < 7) System.out.println("preschool child");
        if (n >= 7 && n <= 17) {
            m = n - 6;
            System.out.println("schoolchild " + m);
        }
        if (n >= 18 && n <= 22) {
            m = n - 17;
            System.out.println("student " + m);
        }
        if(n>22) System.out.println("specialist");

    }
}
