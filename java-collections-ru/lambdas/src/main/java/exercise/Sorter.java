package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

public  class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(user -> "male".equals(user.get("gender")))
                .sorted((u1, u2) -> {
                    LocalDate date1 = LocalDate.parse(u1.get("birthday"));
                    LocalDate date2 = LocalDate.parse(u2.get("birthday"));
                    return date1.compareTo(date2);
                })
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
    }
}
