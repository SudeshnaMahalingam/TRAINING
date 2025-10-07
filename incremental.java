import java.util.*;
import java.io.*;

public class incremental {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] parts = br.readLine().split(" ");
            long[] times = new long[2 * n];
            
            for (int i = 0; i < 2 * n; i++) {
                times[i] = Long.parseLong(parts[i]);
            }
            
            Arrays.sort(times); 
            
            long[] prefix = new long[2 * n + 1];
            for (int i = 0; i < 2 * n; i++) {
                prefix[i + 1] = prefix[i] + times[i];
            }
            
            long[] result = new long[n];
            
            for (int k = 1; k <= n; k++) {
                long total = 0;
                for (int i = 0; i < k; i++) {
                    total += times[2 * n - 1 - i] - times[2 * n - 2 * k + i];
                }
                result[k - 1] = total;
            }
            
            
            for (int i = 0; i < n; i++) {
                System.out.print(result[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
