package exercise;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxThread extends Thread {

    private int[] numbers;
    private Integer max;

    public MaxThread(int[] numbers) {
        this.numbers = numbers;
    }

    public Integer getMax() {
        return max;
    }

    @Override
    public void run() {
        OptionalInt maybe = Arrays.stream(numbers).max();

        if (maybe.isPresent()) {
            max = maybe.getAsInt();
        }
    }
}
