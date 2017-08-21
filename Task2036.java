import java.util.Scanner;

public class Task2036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s2 = new String[n];
        int count;
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'e' || s.charAt(j) == 'y' || s.charAt(j) == 'u' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'a')
                    count++;
                else count=0;
                if (count >= 3) break;
            }
                if (count < 3) s2[i] = s;
        }
        for (int i = 0; i < n; i++) {
            if(s2[i]!=null)
                System.out.println(s2[i]);
        }

    }
}