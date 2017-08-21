import java.util.Scanner;

public class Task2029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = n/2; i>=0 ; i--) {
            if(a[i]==minMass(a)){
                System.out.println(i+1);
                break;
            }
        }

    }
    public static int minMass(int[]a){
        int min=101;
        for (int i = 0; i < a.length; i++) {
            if(min>a[i]) min=a[i];
        }
        return min;
    }
}