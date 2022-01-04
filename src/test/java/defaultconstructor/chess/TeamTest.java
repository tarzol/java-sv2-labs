package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    Team team = new Team();

    @Test
    void testCreate() {
        assertNull(team.getPlayerOne());
    }

    @Test
    void getSetPlayerOne() {
        Player player1 = new Player();
        player1.setName("Peti");
        player1.setEmail("peti@gmail.com");
        Player player2 = new Player();
        player2.setName("Kati");
        player2.setEmail("kati@gmail.com");
        assertEquals("Peti", player1.getName());
        assertEquals("peti@gmail.com", player1.getEmail());
    }
}