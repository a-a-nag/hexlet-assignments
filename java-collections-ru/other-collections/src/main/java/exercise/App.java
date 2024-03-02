package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {

        TreeSet<Map.Entry<String, Object>> sortedSet = new TreeSet<>(Map.Entry.comparingByKey());
        sortedSet.addAll(data1.entrySet());
        sortedSet.addAll(data2.entrySet());

        LinkedHashMap<String, String> resultMap = new LinkedHashMap<>();

        for (Map.Entry<String, Object> entry : sortedSet) {
            resultMap.put(entry.getKey(), "deleted");
        }

        for (Map.Entry<String, Object> entry : data2.entrySet()) {
            if (data1.containsKey(entry.getKey())) {
                Map.Entry<String, Object> tempSet = sortedSet.ceiling(entry);

                if (entry.getValue().equals(tempSet.getValue())) {
                    resultMap.put(entry.getKey(), "unchanged");
                } else {
                    resultMap.put(entry.getKey(), "changed");
                }
            } else {
                resultMap.put(entry.getKey(), "added");
            }
        }

        return resultMap;
    }
}