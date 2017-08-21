import java.util.Scanner;

class Task2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a;
        int n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count = 0;
        int min = 11000;
        for (int i = 0; i < a.length; i++) {
            if (maxCount(a) == count) if (min > a[i]) min = a[i];
            count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) count++;
            }
        }
        System.out.println(min+" "+maxCount(a));
    }

    public static int maxCount(int[] a) {
        int count = 0;
        int max = count;
        for (int i = 0; i < a.length; i++) {
            if (max < count) max = count;
            count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) count++;
            }
        }
        return max;
    }
}

