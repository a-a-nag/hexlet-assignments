package exercise;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");

        Map<String, Integer> wordsFrequency = new HashMap<>();

        if (sentence.isEmpty()) return wordsFrequency;

        for (String word : words) {
            Integer count = wordsFrequency.getOrDefault(word, 0);
            wordsFrequency.put(word, count + 1);
        }

        return wordsFrequency;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) return "{}";

        String mapAsString = "";


        for (Map.Entry<String, Integer> elem : map.entrySet()) {
            mapAsString = mapAsString + "  " + elem.getKey() + ":" +
                    " " + elem.getValue() + "\n";
        }

        String result = "{\n" + mapAsString + "}";

        return result;
    }
}
