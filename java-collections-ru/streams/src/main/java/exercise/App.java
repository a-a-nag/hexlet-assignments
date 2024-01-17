package exercise;

import java.util.List;
import java.util.Arrays;

public class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        long count =  emails.stream()
                .filter(email -> email.endsWith("gmail.com") || email.endsWith("yandex.ru") || email.endsWith("hotmail.com"))
                .count();

        return count;
    }
}
