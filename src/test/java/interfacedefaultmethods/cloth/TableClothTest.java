package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void testTableCloth() {
        TableCloth tableCloth1 = new TableCloth(5);
        assertEquals(20, tableCloth1.getPerimeter());
        assertEquals(25, tableCloth1.getArea());
    }

}