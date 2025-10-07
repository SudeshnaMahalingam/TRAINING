import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt(), y1 = sc.nextInt(), z1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt(), z2 = sc.nextInt();

        // They are on the same face if at least one coordinate is equal
        if (x1 == x2 || y1 == y2 || z1 == z2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
