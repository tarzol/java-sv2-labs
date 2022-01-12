package collectionsiterator;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class OnlineLessonTest {

    @Test
    void testOnlineLesson () {
        OnlineLesson onlineLesson = new OnlineLesson("Peti", "matek", LocalDateTime.of(2022,01,01,8,00));
        assertEquals("Peti", onlineLesson.getName());
        assertEquals("matek", onlineLesson.getNameOfLesson());
        assertEquals(LocalDateTime.of(2022,01,01,8,0), onlineLesson.getLocalDateTime());
    }

}
