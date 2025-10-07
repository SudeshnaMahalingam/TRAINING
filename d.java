import java.util.*;
public class Blinds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int l = sc.nextInt();
        
        int[] arr = new int[n];
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            maxLen = Math.max(maxLen, arr[i]);
        }
        
        int maxArea = 0;
        
        
        for (int d = l; d <= maxLen; d++) {
            int pieces = 0;
            for (int ai : arr) {
                pieces += ai / d; 
            }
            maxArea = Math.max(maxArea, pieces * d);
        }
        
        System.out.println(maxArea);
    }
}
