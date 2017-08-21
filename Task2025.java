import java.util.Scanner;

public class Task2025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b;
        b = new int[m];
        for(int i=0;i<m;i++){
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            int min=101;
            for(int j=l-1;j<r;j++){
                if (min>a[j]) min=a[j];
            }
            b[i]=min;
        }
        for(int i=0;i<m;i++){
            System.out.println(b[i]);
        }

    }

}