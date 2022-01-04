package methodoverloading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA = new ClassFiveA();

    @Test
    void getTodayReferringStudent() {
        assertEquals("Németh Piroska", classFiveA.getTodayReferringStudent(2));
    }

    @Test
    void testGetTodayReferringStudent() {
        assertEquals("Németh Piroska", classFiveA.getTodayReferringStudent(Number.TWO));
    }

    @Test
    void testGetTodayReferringStudent1() {
        assertEquals("Németh Piroska", classFiveA.getTodayReferringStudent("two"));
    }
}