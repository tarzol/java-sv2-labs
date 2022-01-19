package lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {

    List<Integer> input;

    @BeforeEach
    void init() {
        input = new ArrayList<>(Arrays.asList(45, 13, 64, 51, 92, 33));
    }

    @Test
    void changeNumbersToRemaindersWith3() {
        Remainder remainder = new Remainder();

        remainder.changeNumbersToRemainders(input, 3);
        assertEquals(Arrays.asList(30, 9, 43, 34, 62, 22), input);
    }

    @Test
    void changeNumbersToRemaindersWith10() {
        Remainder remainder = new Remainder();

        remainder.changeNumbersToRemainders(input, 10);
        assertEquals(Arrays.asList(41, 12, 58, 46, 83, 30), input);
    }
}