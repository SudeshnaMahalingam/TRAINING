import java.util.*;

public class Main {
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;
            long g = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
                if (i == 0) g = a[i];
                else g = gcd(g, a[i]);
            }
            
            if (n == 1) {
                System.out.println(a[0]);
            } else if (n == 2) {
                long min = Math.min(a[0], a[1]);
                System.out.println(sum - min);
            } else {
                if (g == 1) System.out.println(-1);
                else System.out.println(sum);
            }
        }
        
        sc.close();
    }
}
