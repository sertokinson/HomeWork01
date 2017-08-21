import java.util.Scanner;

public class Task2039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        int f = 1;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                f = 1;
            } else if (f == 1) {
                count++;
                f = 0;
            }
            if (((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) && i == s.length() - 1)
                count++;
        }
        System.out.println(count);
    }
}