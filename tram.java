import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 0;
        int maxCap = 0;
        
        for (int i = 0; i < n; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            current -= out;      // people exit first
            current += in;       // then people enter
            if (current > maxCap) maxCap = current;
        }
        
        System.out.println(maxCap);
        sc.close();
    }
}
