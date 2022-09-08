package lesson8;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Introspection {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class_B class_b=new Class_B("testNameClasA",4,"testNameClasB",3);

        Set<String> fieldNames = Arrays.stream(class_b.getClass().getSuperclass().getDeclaredFields())
                .map(f -> f.getName()).collect(Collectors.toSet());
        System.out.println(fieldNames);

        Field f1 = class_b.getClass().getSuperclass().getDeclaredField("a1");
        f1.setAccessible(true);
        System.out.println(f1.get(class_b));

        Field f2 = class_b.getClass().getSuperclass().getDeclaredField("a2");
        f1.setAccessible(true);
        System.out.println(f2.get(class_b));

    }
}
