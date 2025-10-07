import java.util.Scanner;

public class theatresquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong(); 
        long m = scanner.nextLong();
        long a = scanner.nextLong(); 

        long length = (n + a - 1) / a; 
        long width = (m + a - 1) / a;  

        long result = length * width;  

        System.out.println(result);

        scanner.close();
    }
}
