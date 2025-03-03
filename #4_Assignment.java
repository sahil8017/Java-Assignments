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
