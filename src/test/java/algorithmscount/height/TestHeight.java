package algorithmscount.height;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHeight {
    @Test
    void testcountChildrenWithHeightGreaterThan() {
        Height height = new Height();
        int[] children = {123, 167, 135, 120};
        int count = height.countChildrenWithHeightGreaterThan(children, 150);
        assertEquals(3, count);
    }
}
