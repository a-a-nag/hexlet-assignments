package exercise;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinThread extends Thread {

    private int[] numbers;
    private Integer min;

    public MinThread(int[] numbers) {
        this.numbers = numbers;
    }

    public Integer getMin() {
        return min;
    }

    @Override
    public void run() {
        OptionalInt maybe =  Arrays.stream(numbers).min();

        if (maybe.isPresent()) {
            min = maybe.getAsInt();
        }
    }
}
