/*
Write a Java program using reflection to:

Dynamically create objects of two inner classes (student and subject).
Modify their fields using reflection.
Invoke their display() methods to print updated values.
*/
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class multipleclasses {
    public static void main(String args[]) {
        student s1 = createStudent("Sahil", 20);
        subject sb1 = createSubject("Computer", "Mathematics");

        s1.display();
        sb1.display();
    }

    static student createStudent(String name, int rollno) {
        student s = null;
        try {
            Class<?> objClass = Class.forName("multipleclasses$student");
            Constructor<?> constructor = objClass.getConstructor();
            Object obj = constructor.newInstance();

            Field nameField = objClass.getDeclaredField("name");
            Field rollField = objClass.getDeclaredField("rollno");

            nameField.setAccessible(true);
            rollField.setAccessible(true);

            nameField.set(obj, name);
            rollField.set(obj, rollno);

            s = (student) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    static subject createSubject(String sub1, String sub2) {
        subject sb = null;
        try {
            Class<?> objClass = Class.forName("multipleclasses$subject");
            Constructor<?> constructor = objClass.getConstructor();
            Object obj = constructor.newInstance();

            Field sub1Field = objClass.getDeclaredField("sub1");
            Field sub2Field = objClass.getDeclaredField("sub2");

            sub1Field.setAccessible(true);
            sub2Field.setAccessible(true);

            sub1Field.set(obj, sub1);
            sub2Field.set(obj, sub2);

            sb = (subject) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb;
    }

    static class student {
        String name;
        int rollno;
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Rollno: " + rollno);
        }
    }

    static class subject {
        String sub1, sub2;
        void display() {
            System.out.println("Subject1: " + sub1);
            System.out.println("Subject2: " + sub2);
        }
    }
}
