import java.util.Scanner;

public class Task2030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            int sum=a[i];
            for (int j=i;j<n;j++){
                sum+=a[j];
                if(sum==0){
                    count++;
                }
                if(i==j) sum=a[i];
            }
        }
        System.out.println(count);
    }
}