package exercise;

import java.util.Arrays;
import java.util.List;

public class App {
    public static String[][] enlargeArrayImage(String[][] array) {
        return Arrays.stream(array)
                .map(subArray -> Arrays.stream(subArray)
                        .map(elem -> List.of(elem, elem))
                        .flatMap(List::stream)
                        .toArray(String[]::new))
                .map(subArray -> List.of(subArray, subArray))
                .flatMap(List::stream)
                .toArray(String[][]::new);
    }
}
