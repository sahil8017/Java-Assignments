public class PatternPrograms {
    public static void main(String args[]) {
        int i, j;

        // Pattern 1
        /*
        for(i = 0; i < 4; i++) {
            for(j = 0; j < 4; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
        */

        // Pattern 2
        /*
        for(i = 1; i <= 4; i++) {
            for(j = i; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        // Pattern 3
        /*
        for(i = 0; i < 4; i++) {
            for(j = 0; j < 4; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        */

        // Pattern 4
        /*
        for(i = 4; i >= 1; i--) {
            for(j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */
    }
}
