import java.util.Scanner;

public class Solution {
    public static int calculateGCD(int x, int y) {
        if (y == 0) {
            return x;
        }
        return calculateGCD(y, x % y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int num_test_cases = scanner.nextInt();

        for (int t = 0; t < num_test_cases; t++) {
            
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            int gcd = calculateGCD(X, Y);
            System.out.println( gcd);
        }

        scanner.close();
    }
}


