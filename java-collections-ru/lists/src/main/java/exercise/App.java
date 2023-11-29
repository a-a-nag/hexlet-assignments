package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static boolean scrabble(String symbols, String word) {

        if (symbols.length() < word.length()) {
            return false;
        }

        String[] symbolsArr = symbols.toLowerCase().split("");
        String[] wordArr = word.toLowerCase().split("");


        List<String> list1 = new ArrayList<>(Arrays.asList(symbolsArr));
        List<String> list2 = new ArrayList<>(Arrays.asList(wordArr));

        boolean isContains = false;

        for (String symbol : list2) {
            if (list1.contains(symbol)) {
                list1.remove(list1.indexOf(symbol));
//                list2.remove(list2.indexOf(symbol));
            } else {
                return false;
            }
        }

        isContains = true;
        return isContains;
    }
}
