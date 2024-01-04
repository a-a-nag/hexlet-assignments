package exercise;

import java.util.ArrayList;
import java.util.List;

class App {
    public static ArrayList<Integer> take(List<Integer> elements, int count) {
        String implementation = System.getenv("IMPLEMENTATION") != null
            ? System.getenv("IMPLEMENTATION")
            : "right";

        switch (implementation) {
            case "wrong1":
                return (ArrayList<Integer>) Implementations.wrong1(elements, count);
            case "wrong2":
                return (ArrayList<Integer>) Implementations.wrong2(elements, count);
            case "wrong3":
                return (ArrayList<Integer>) Implementations.wrong3(elements, count);
            default:
                return (ArrayList<Integer>) Implementations.right(elements, count);
        }
    }
}
