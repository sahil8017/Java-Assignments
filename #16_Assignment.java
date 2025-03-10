// W.A.P using a method to find the number of elements in a given integer array which are divisible by 7. Pass this array in a method.
import java.util.Scanner;

class DivisibleBySeven {
    
    public static int countDivisibleBy7(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 7 == 0) count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        
        System.out.println("Count: " + countDivisibleBy7(arr));
    }
}
