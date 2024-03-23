package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
public class Validator {
    public static List<String> validate(Address address) {
        List<String> list = new ArrayList<>();

        Class<?> aClass = address.getClass();

        Field[] declaredFields = aClass.getDeclaredFields();

        for (var field : declaredFields) {
            field.setAccessible(true);

            try {
                if (field.get(address) == null && field.isAnnotationPresent(NotNull.class)) {
                    list.add(field.getName());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return list;
    }
}
