package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int count) {
        List<String> result = new ArrayList<>();

        List<Home> sort = homes.stream()
                .sorted((e1, e2) -> e1.compareTo(e2))
                .collect(Collectors.toList());

        if (count > homes.size()) {
            count = homes.size();
        }

        for (int i = 0; i < count; i++) {
            result.add(sort.get(i).toString());
        }

        return  result;
    }
}
