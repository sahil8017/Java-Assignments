import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

class Abc {
    private String name;  


    public Abc(String name) {
        this.name = name;
    }


    public void show() {
        System.out.println("Name: " + name);
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {

            Class<?> objClass = Class.forName("Abc");


            Constructor<?> constructor = objClass.getConstructor(String.class);


            Object obj = constructor.newInstance("Reflection Example");


            Field field = objClass.getDeclaredField("name");
            field.setAccessible(true);  

            System.out.println("Before Modification: " + field.get(obj));


            field.set(obj, "Updated Name");


            System.out.println("After Modification: " + field.get(obj));


            ((Abc) obj).show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
