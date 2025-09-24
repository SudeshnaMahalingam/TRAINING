import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        
        
        if (s.contains("HH")) {
            System.out.println("NO");
            return;
        }
        
        
        String result = s.replace('.', 'B');
        System.out.println("YES");
        System.out.println(result);
    }
}
