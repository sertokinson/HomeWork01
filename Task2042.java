import java.util.Scanner;

public class Task2042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if((i+j)<s1.length())
                if ((s1.charAt(i + j) == s2.charAt(j)) || (s2.charAt(j) == '?'))
                    count++;
            }
            if (count == s2.length()) System.out.print(i+1+" ");
            count = 0;
        }
    }
}