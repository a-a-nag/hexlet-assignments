package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> mapTemp = new HashMap<>();
        mapTemp.putAll(storage.toMap());

        for (Map.Entry<String, String> entry : mapTemp.entrySet()) {
            String key = entry.getKey();
            storage.unset(key);
        }

        for (Map.Entry<String, String> entry : mapTemp.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            storage.set(value, key);
        }
    }
}
