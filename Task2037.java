import java.util.Scanner;

public class Task2037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        String s2 = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ',') {
                count++;
                s2+=s.charAt(i);
            }
            if (((s.charAt(i) == ',')||(i==s.length()-1))&&(count>=k))
                System.out.print(s2);
            if(s.charAt(i) == ','&&!s2.equals("")&&!s2.equals(",")) {
                if(count>=k)
                s2=",";
                else s2="";
                count = 0;
            }

        }
    }
}
