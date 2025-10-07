import java.util.*;
public class squarestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine(); 

        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();

            if (n % 2 != 0) {
                System.out.println("NO"); 
            } 
            else {
                String firsthalf = s.substring(0, n / 2);
                String secondhalf = s.substring(n / 2);
                if (firsthalf.equals(secondhalf)) {
                    System.out.println("YES");
                } 
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}

