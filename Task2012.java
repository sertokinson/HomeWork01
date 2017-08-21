import java.util.Scanner;

public class Task2012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int max = a1;
        if (a2 > max)
            max=a2;
        if (b1>max)
            max=b1;
        if(b2>max)
            max=b2;
        if(max*max==a1*b1+a2*b2)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
