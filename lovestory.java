import java.util.*;

public class LoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine(); 
        String target = "codeforces";

        while (t-- > 0) {
            String s = sc.nextLine();
            int diff = 0;

            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != target.charAt(i)) {
                    diff++;
                }
            }

            System.out.println(diff);
        }
    }
}
