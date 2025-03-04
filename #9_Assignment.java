// Write a Java program to print the word representation of a given number (1-5).

public class numbers {
    public static void main(String args[]) {
        int a_number = 5;

        switch (a_number) {
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            case 3: System.out.println("three"); break;
            case 4: System.out.println("four"); break;
            case 5: System.out.println("five"); break;
            default: System.out.println("Number out of range"); 
        }
    }
}
