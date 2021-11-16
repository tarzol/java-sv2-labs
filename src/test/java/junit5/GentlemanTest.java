package junit5;

import introjunit.Gentleman;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GentlemanTest {
    @Test
    void testCreate() {
        //Given
        Gentleman gentleman = new Gentleman();
        //When
        String name = gentleman.sayHello("John Doe");
        //Then
        assertEquals("Hello John Doe", name);

    }
    @Test
    void testCreateAno() {
        //Given
        Gentleman gentleman = new Gentleman();
        //When
        String name = gentleman.sayHello(null);
        //Then
        assertEquals("Hello Anonymus", name);


    }

}
