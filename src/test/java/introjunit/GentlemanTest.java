package introjunit;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {
    @Test
    public void testCreate() {
        //Given
        Gentleman gentleman = new Gentleman();
        //Trainer trainer = new Trainer("John Doe");

        //When
        String message = gentleman.sayHello("John Doe");
                //trainer.getName();

        //Then
        assertThat(message, equalTo("Hello John Doe"));
    }
}
