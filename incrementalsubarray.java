import java.util.*;

public class incrementalsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }

            
            boolean next= true;
            for (int i = 0; i < m - 1; i++) {
                if (a[i + 1] != a[i] + 1) {
                    next= false;
                    break;
                }
            }

            if (next && a[m - 1] <= n) {
                
                int count = n - a[m - 1] + 1;
                System.out.println(count);
            } else {
                
                System.out.println(1);
            }
        }
        
    }
}
