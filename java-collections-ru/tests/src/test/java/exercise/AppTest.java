package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> elements;

    @BeforeEach
    void initListElements () {
        this.elements = new ArrayList<>();
        this.elements.add(1);
        this.elements.add(2);
        this.elements.add(3);
        this.elements.add(4);
        this.elements.add(5);
    }

    @Test
    void testTake() {
        List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual2 = Arrays.asList();

        List expected = App.take(elements, 5);
        assertThat(actual).isEqualTo(expected);

        expected = App.take(elements, 6);
        assertThat(actual).isEqualTo(expected);

        expected = App.take(elements, 0);
        assertThat(actual2).isEqualTo(expected);
    }
}
