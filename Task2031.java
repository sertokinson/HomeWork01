import java.util.Scanner;

public class Task2031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a;
        a = new int[n];
        int[] b;
        b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count=0;
        boolean f;
        for (int i = 0; i < n; i++) {
            maxMass(a);
        }
        for (int i = 0; i < n; i++) {
            f=true;
            for(int j=0;j<n;j++){
                if(a[i]==b[j]){
                    f=false;
                    break;
                }
            }
            if(countMass(a[i],a)>1&&f){
                count++;
                b[i]=a[i];
            }
        }
        System.out.println(count);
        for (int i = 0; i < n; i++) {
            if(b[i]!=0){
                System.out.print(b[i]+" ");
            }
        }


    }
    public static int countMass(int x,int[]a){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void maxMass(int[] a) {
        int x;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                x = a[i];
                a[i] = a[i + 1];
                a[i + 1] = x;
            }
        }
    }
}