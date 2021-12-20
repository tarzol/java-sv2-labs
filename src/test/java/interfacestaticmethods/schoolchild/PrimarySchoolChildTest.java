package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {


    @Test
    void testLowerClassChild() {
        PrimarySchoolChild child1 = new LowerClassSchoolChild(8);
        assertEquals(LowerClassSchoolChild.class, child1.getClass());
    }

    @Test
    void testUpperClassChild() {
        PrimarySchoolChild child2 = new UpperClassSchoolChild(12);
        assertEquals(UpperClassSchoolChild.class, child2.getClass());
    }

    @Test
    void testAgeOutOfRange() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()->PrimarySchoolChild.of(16));
        assertEquals("A megadott személy nem az adott korosztályú.", exception.getMessage());
    }


}