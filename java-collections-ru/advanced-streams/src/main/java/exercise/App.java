package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class App {
    public static String getForwardedVariables(String config) {
        return config.lines()
                .filter(line -> line.startsWith("environment"))
                .map(line -> line.replaceAll("\"", ""))
                .map(line -> line.replaceAll("environment=", "")
                        .split((",")))
                .map(arr -> Arrays.stream(arr)
                        .filter(elem -> elem.contains("X_FORWARDED"))
                        .map(elem -> elem.replaceAll("X_FORWARDED_", ""))
                        .collect(Collectors.toList()))
                .flatMap(List::stream)
                .collect(Collectors.joining(","));
    }
}