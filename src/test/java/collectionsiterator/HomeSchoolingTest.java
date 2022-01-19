package collectionsiterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HomeSchoolingTest {


    HomeSchooling schooling;

    @BeforeEach
    void init() {
        schooling = new HomeSchooling();

        schooling.add(new OnlineLesson("Kiss József", "matematika", LocalDateTime.of(2021, 12, 14, 8, 0)));
        schooling.add(new OnlineLesson("Nagy Béla", "biológia", LocalDateTime.of(2021, 12, 15, 8, 1)));
        schooling.add(new OnlineLesson("Kiss József", "matematika", LocalDateTime.of(2021, 12, 16, 8, 2)));
        System.out.println("Méret: "+schooling.getOnlineLessons().size() );
        //schooling.addNewLesson(new OnlineLesson("Kiss József", "matematika", LocalDateTime.of(2021, 12, 14, 8, 0)));
        //schooling.addNewLesson(new OnlineLesson("Nagy Béla", "biológia", LocalDateTime.of(2021, 12, 15, 8, 0)));
        //schooling.addNewLesson(new OnlineLesson("Kiss József", "matematika", LocalDateTime.of(2021, 12, 16, 8, 0)));
    }

    @Test
    void testAddNewLesson() {
        OnlineLesson lesson = new OnlineLesson("Nagy Béla", "biológia", LocalDateTime.of(2021, 12, 14, 12, 0));
        schooling.addNewLesson(lesson);
        assertEquals(4, schooling.getOnlineLessons().size());
        //assertEquals("Nagy Béla", schooling.getOnlineLessons().get(3).getName() );
        //assertEquals("biológia", schooling.getOnlineLessons().get(3).getNameOfLesson() );

    }

}