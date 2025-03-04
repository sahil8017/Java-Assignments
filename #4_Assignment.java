/*
Write a Java program using reflection to:

Dynamically create an object of the inner class Student.
Modify its fields (name and rollno).
Invoke the display() method to print updated values.
*/    
    
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Objcreation {
    public static void main(String args[]) {
        try {
            Class<?> objClass = Class.forName("Objcreation$Student");
            Constructor<?> constructor = objClass.getConstructor();
            Object obj = constructor.newInstance();

            Field nameField = objClass.getDeclaredField("name");
            Field rollField = objClass.getDeclaredField("rollno");

            nameField.setAccessible(true);
            rollField.setAccessible(true);

            nameField.set(obj, "Sahil");
            rollField.set(obj, 20);

            ((Student) obj).display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Student {
        String name;
        int rollno;

        void display() {
            System.out.println("Name : " + name);
            System.out.println("Roll_No : " + rollno);
        }
    }
}
