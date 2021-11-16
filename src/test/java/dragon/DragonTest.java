package dragon;

import introjunit.Gentleman;
import junit5assert.Dragon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {
    @Test
    void testName() {
        //Given
        Dragon dragon = new Dragon("Susu", 7, 5.6);
        //When
        String name = dragon.getName();
        //Then
        assertEquals("Susu", name);
        assertNotEquals("Sus", name);
    }

    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Susu", 7, 5.6);
        int numberOfHeads = dragon.getNumberOfHeads();
        assertEquals(7, numberOfHeads );
        assertTrue(numberOfHeads == 7);
        assertFalse(numberOfHeads == 7);
    }

    void testHeight() {
        Dragon dragon = new Dragon("Susu", 7, 5.6);
        double heightOfDragon = dragon.getHeight();
        assertEquals(heightOfDragon, 5.6, 0.01);
    }

    void testNull() {
        Dragon dragon = new Dragon("Susu", 7, 5.6);
        Dragon dragon1 = null;
        assertNull(dragon);
        assertNotNull(dragon1);
    }

    void testSameObjects() {
        Dragon dragon = new Dragon("Susu", 7, 5.6);
        Dragon dragon1 = dragon;
        assertSame(dragon, dragon1);
    }

    void testNotSameObjects() {
        Dragon dragon = new Dragon("Susu", 7, 5.6);
        Dragon dragon1 = new Dragon("Susu", 7, 5.6);
        assertSame(dragon, dragon1);
        assertNotSame(dragon, dragon1);
    }
}
