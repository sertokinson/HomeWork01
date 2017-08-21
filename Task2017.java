import java.util.Scanner;

public class Task2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int f = 0;
        for (int i = a; i <= b; i++) {

            if (countDel(i) == maxCount(a, b)) {
                if (f == 0) {
                    System.out.print(i);
                    f = 1;
                } else System.out.print("," + i);

            }

        }

    }

    public static int countDel(int a) {
        int count = 0;
        for (int i = 2; i <= a/2; i++) {
            if (a % i == 0) count++;
        }
        return count;
    }

    public static int maxCount(int a, int b) {
        int max = countDel(a);
        for (int i = a + 1; i <= b; i++) {
            if (max < countDel(i)) max = countDel(i);
        }
        return max;
    }

}