package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList());

        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> actual1 = App.take(numbers1, 3);

        assertThat(expected1).isEqualTo(actual1);

        List<Integer> expected2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> actual2 = App.take(numbers1, 6);

        assertThat(expected2).isEqualTo(actual2);

        List<Integer> expected3 = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> actual3 = App.take(numbers2, 6);

        assertThat(expected3).isEqualTo(actual3);


    }
}
