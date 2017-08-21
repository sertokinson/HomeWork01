import java.util.Scanner;

public class Task2034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        a = new int[n];
        int l=0,r=0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max=0;
        int count;
        for (int i = 0; i < n; i++) {
            count=0;
            for (int j = i+1; j < n; j++) {
                if(Math.abs(a[i]-a[j])<=1){
                    count++;
                    if(max<count){
                        max=count;
                        l=i;
                        r=j;
                    }

                }
                else break;
            }
        }
        System.out.println(l+1+" "+r);
    }
}