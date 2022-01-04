package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum nums = new NumbersSum();

    @Test
    void testGetSumWithIntNull() {
        int[] numbers = null;
        assertThrows(IllegalArgumentException.class, ()->nums.getSum(numbers));
        Exception ex = assertThrows(IllegalArgumentException.class, ()->nums.getSum(numbers));
        assertEquals("The value of array is null!", ex.getMessage());
    }

    @Test
    void testGetSumWithStringNull() {
        String[] numbers = null;
        Exception ex = assertThrows(IllegalArgumentException.class, ()->nums.getSum(numbers));
        assertEquals("The value of array is null!", ex.getMessage());
    }

    @Test
    void testGetSumWithStringNotNumber() {
        String[] numbers = {"1", "2", "A"};
        Exception ex = assertThrows(IllegalArgumentException.class, ()->nums.getSum(numbers));
        assertEquals("There is an element that cannot be converted to number!", ex.getMessage());
    }

    @Test
    void testGetSumWithInt() {
        int sum = nums.getSum(new int[]{ 1, 2, 3, 4 });
        assertEquals(10, sum);
    }

    @Test
    void testGetSumWithIntString() {
        int sum = nums.getSum(new String[]{"1", "2", "3"});
        assertEquals(6, sum);
    }
}