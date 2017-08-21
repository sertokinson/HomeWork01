import java.util.Scanner;

public class Task2026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int f=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    a[i]=a[j];
                    f=1;
                    break;
                }
            }
            if(f==0)
                a[i]=0;
            else f=0;

        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}