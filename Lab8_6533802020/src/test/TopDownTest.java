package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class TopDownTest {

    @Test
    //1
    void testDistanceConverter_1km_to_1000m() {
        Stub stub = new Stub();
        double expectedResult = 1000.0;
        assertEquals(expectedResult, stub.convert(1, "kilometer", "meter"));
    }

    @Test
    //2
    void testDistanceConverter_5km_to_5000m() {
        Stub stub = new Stub();
        double expectedResult = 5000.0;
        assertEquals(expectedResult, stub.convert(5, "kilometer", "meter"));
    }
}

