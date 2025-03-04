// Demonstrating Post-Decrement
public class postdecrement {
    public static void main(String args[]) {
        int n = 10;
        int postdec = n--; // Assign first, then decrement
        System.out.println("Post-Decrement: " + postdec);
        System.out.println("After Post-Decrement: " + n);
    }
}

// Demonstrating Post-Increment
public class postincrement {
    public static void main(String args[]) {
        int n = 10;
        int postinc = n++; // Assign first, then increment
        System.out.println("Post-Increment: " + postinc);
        System.out.println("After Post-Increment: " + n);
    }
}

// Demonstrating Pre-Decrement
public class predecrement {
    public static void main(String args[]) {
        int n = 10;
        int predec = --n; // Decrement first, then assign
        System.out.println("Pre-Decrement: " + predec);
        System.out.println("After Pre-Decrement: " + n);
    }
}

// Demonstrating Pre-Increment
public class preincrement {
    public static void main(String args[]) {
        int n = 10;
        int preinc = ++n; // Increment first, then assign
        System.out.println("Pre-Increment: " + preinc);
        System.out.println("After Pre-Increment: " + n);
    }
}
