import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();
  
        int count1 = countVowels(line1);
        int count2 = countVowels(line2);
        int count3 = countVowels(line3);
        
        if (count1 == 5 && count2 == 7 && count3 == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    private static int countVowels(String line) {
        int count = 0;
        for (char ch : line.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
