package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

public class App {

    public static List findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book : books) {
            boolean contains = false;

            for (Map.Entry<String, String> elem : where.entrySet()) {

                if (book.containsValue(elem.getValue())) {
                    contains = true;
                } else {
                    contains = false;
                    break;
                }
            }

            if (contains) {
                result.add(book);
            }
        }

        return result;
    }
}
