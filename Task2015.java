import java.util.Scanner;

public class Task2015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SimpleN(n);
    }
    public static void SimpleN(int n) {
        int f=0;
        for(int i=2;i<=n;i++){
            for(int j=2;j<=Math.sqrt(n);j++){
                if ((i!=j)&&(i%j==0)){
                    f=1;
                }
            }
            if(f==0)
                System.out.println(i);
            else f=0;
        }
    }

}
