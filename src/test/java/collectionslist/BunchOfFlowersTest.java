package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {

    BunchOfFlowers bunch;

    @BeforeEach
    void init() {
        bunch = new BunchOfFlowers();
        bunch.flowers.add("virág");
        bunch.flowers.add("virág");
        bunch.flowers.add("virág");
        bunch.flowers.add("virág");
    }


    @Test
    void testAddFlowerInTheMiddleStartEven() {
        bunch.addFlowerInTheMiddle("szegfű");
        assertEquals(5, bunch.flowers.size());
        assertEquals("virág", bunch.flowers.get(0));
        assertEquals("virág", bunch.flowers.get(1));
        assertEquals("szegfű", bunch.flowers.get(2));
        assertEquals("virág", bunch.flowers.get(3));
        assertEquals("virág", bunch.flowers.get(4));
    }

    @Test
    void testAddFlowerInTheMiddleStartOdd() {
        bunch.flowers.add("virág");
        bunch.addFlowerInTheMiddle("szegfű");
        assertEquals(7, bunch.flowers.size());
        assertEquals("virág", bunch.flowers.get(0));
        assertEquals("virág", bunch.flowers.get(1));
        assertEquals("szegfű", bunch.flowers.get(2));
        assertEquals("virág", bunch.flowers.get(3));
        assertEquals("szegfű", bunch.flowers.get(4));
        assertEquals("virág", bunch.flowers.get(5));
        assertEquals("virág", bunch.flowers.get(6));
    }
}