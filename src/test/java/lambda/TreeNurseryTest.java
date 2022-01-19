package lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeNurseryTest {

    TreeNursery treeNursery;

    @BeforeEach
    void init() {
        List<Sapling> saplings = new ArrayList<>(Arrays.asList(
                new Sapling("kocsányos tölgy", 30),
                new Sapling("starking alma", 70),
                new Sapling("besztercei szilva", 85),
                new Sapling("besztercei szilva", 58),
                new Sapling("magyar kajszi", 93),
                new Sapling("besztercei szilva", 102),
                new Sapling("madárbirs", 45)
        ));
        treeNursery = new TreeNursery(saplings);
    }

    @Test
    void testPrune() {
        treeNursery.prune(90);
        assertEquals(7, treeNursery.getSaplings().size());
        assertEquals(90, treeNursery.getSaplings().get(5).getHeight());
        assertEquals("besztercei szilva",treeNursery.getSaplings().get(5).getSpecies());
    }

    @Test
    void testSell() {
        treeNursery.sell("besztercei szilva", 100);
        assertEquals(6, treeNursery.getSaplings().size());
    }
}