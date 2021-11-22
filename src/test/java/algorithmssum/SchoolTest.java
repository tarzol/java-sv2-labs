package algorithmssum;

import algorithmssum.school.School;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SchoolTest {
    @Test
    void testGetNumberOfStudents () {
        School school = new School();
        List<Integer> numbers = Arrays.asList(1, 3, 5);
        int studentNumber = school.getNumberOfStudents(numbers);
        assertEquals(9,studentNumber);
    }
}
