package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player1 = new Player();

    @Test
    void setName() {
        player1.setName("Peti");
        assertEquals("Peti", player1.getName());
    }

    @Test
    void setEmailAddress() {
        player1.setEmail("peti@gmail.com");
        assertEquals("peti@gmail.com", player1.getEmail());
    }
}