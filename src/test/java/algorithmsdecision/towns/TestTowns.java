package algorithmsdecision.towns;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestTowns {

    //List<Integer> villages = Arrays.asList(4000, 3000, 2000, 1000);
    Town town = new Town();
    //Boolean isItTrue = town.containsFewerHabitants(villages, 2500);

    @BeforeEach
    void initVillages() {
    }

    @Test
    void TestcontainsFewerHabitants0() {
        List<Integer> villages = Arrays.asList(4000, 3000, 2000, 1000);
        Boolean isItTrue = town.containsFewerHabitants(villages, 2500);
        assertTrue(isItTrue);
    }
    @Test
    void TestcontainsFewerHabitants1() {
        List<Integer> villages1= Arrays.asList(4000, 3000, 2000, 1000);
        Boolean isItTrue = town.containsFewerHabitants(villages1, 3500);
        assertTrue(isItTrue);
    }

    @Test
    void TestcontainsFewerHabitants2() {
        List<Integer> villages2= Arrays.asList(4000, 3000, 2000, 1000);
        Boolean isItTrue = town.containsFewerHabitants(villages2, 500);
        assertTrue(isItTrue);
    }

}
