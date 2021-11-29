package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {
    Man man = new Man("Lajos", new ArrayList<>());

    @Test
    void testSetName ( ) {
        Marriage marriage = new Marriage();
        //marriage.getMarried();

        assertEquals("Lajos", man.getName());
        man.setName("Peti");
        assertEquals("Peti", man.getName());
    }

    @Test
    void testRegisterDates() {
        man.addRegisterDates(new RegisterDate("születés", LocalDate.of(1977,7,7)));
        assertEquals("születés", man.getRegisterDates().get(0).getDescription());
        assertEquals(1, man.getRegisterDates().size());
        man.addRegisterDates(new RegisterDate("házasságkötés", LocalDate.of(2001,7,7)));
        assertEquals(2, man.getRegisterDates().size());
        assertEquals("házasságkötés", man.getRegisterDates().get(1).getDescription());
    }
}