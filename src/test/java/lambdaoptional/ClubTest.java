package lambdaoptional;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ClubTest {

    @Test
    void testMember() {
        Member member = new Member("Zoli", Arrays.asList("Angol", "Német"), Gender.MALE);
        assertEquals("Zoli", member.getName());
        assertEquals("Angol" , member.getSkills().get(0));
    }

    @Test
    void testFindFirst() {
        Club club1 = new Club(Arrays.asList(
                new Member("John Doe", Arrays.asList("Java", "OOP"), Gender.MALE),
                new Member("Jane Doe", Arrays.asList(".NET", "OOP"), Gender.FEMALE),
                new Member("James Doe", Arrays.asList("Python", "Java", "OOP"), Gender.MALE),
                new Member("Janet Doe", Arrays.asList("JavaScript", "scripting"), Gender.MALE)
        ));
        assertTrue(club1.findFirst(member -> member.getName().equals("John Doe")).isPresent());
    }

    @Test
    void testAverage() {
        assertEquals(false, new Club(Collections.emptyList()).averageNumberOfSkills().isPresent());
        Club club = new Club(Arrays.asList(
                new Member("John Doe", Arrays.asList("Java", "OOP"), Gender.MALE),
                new Member("Jane Doe", Arrays.asList(".NET", "OOP"), Gender.FEMALE),
                new Member("James Doe", Arrays.asList("Python", "Java", "OOP"), Gender.MALE),
                new Member("Janet Doe", Arrays.asList("JavaScript", "scripting"), Gender.MALE)
        ));
        assertEquals(2.25, club.averageNumberOfSkills().get());
    }

}