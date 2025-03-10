// W.A.P to find factorial of a given no. using recursive method.
import java.util.Scanner;
class FactorialCalculator {
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
