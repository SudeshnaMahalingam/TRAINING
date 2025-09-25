import java.util.Scanner;

public class talesofsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            long ans = 0;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    ans = Math.max(ans, a[i]);
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
