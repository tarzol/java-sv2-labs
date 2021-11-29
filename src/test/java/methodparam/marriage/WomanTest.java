package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {

    @Test
    void testAddregisterDates() {
        List<RegisterDate> KataLista = new ArrayList<>();
        List<RegisterDate> LajosLista = new ArrayList<>();
        Marriage marriage = new Marriage();
        marriage.getMarried(new Woman("Kata", KataLista), new Man("Lajos", LajosLista));
        assertEquals(1, KataLista.size());
        marriage.getMarried(new Woman("Kata", KataLista), new Man("Lajos", LajosLista));
        assertEquals(2,LajosLista.size());
    }

    @Test
    void testRegisterDate() {
        RegisterDate registerDate1 = new RegisterDate("születési idő", LocalDate.of(1961, 10, 05));
        Woman woman1 = new Woman("Kovács Piroska", new ArrayList<>());
        assertEquals("Kovács Piroska",woman1.getName());
        woman1.addRegisterDates(registerDate1);
        assertEquals(LocalDate.of(1961,10,05), woman1.getRegisterDates().get(0).getDate());
        woman1.addRegisterDates(new RegisterDate("házasságkötés", LocalDate.now()));
        assertEquals(2, woman1.getRegisterDates().size());
    }
}


    /*RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.of(1983, 10, 22));
    Woman woman = new Woman("Nagy Rozália", new ArrayList<>(Arrays.asList(registerDate)));

    assertEquals("Nagy Rozália", woman.getName());
        assertEquals(1, woman.getRegisterDates().size());
        assertEquals(LocalDate.of(1983, 10, 22), woman.getRegisterDates().get(0).getDate());
        }*/