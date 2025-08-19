package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.*;



public class BottomUpTest {

    @Test
    //1
    void testDistanceConverter_km_to_mile() {
        DistanceConverter dc = new DistanceConverter();
        assertEquals(1.242, dc.convert(2, "kilometer", "mile"), 0.001);
    }

    @Test
    //2
    void testWeightConverter_1000g_to_kg() {
        WeightConverter wc = new WeightConverter();
        assertEquals(1.0, wc.convert(1000, "gram", "kilogram"), 0.001);
    }

    @Test
    //3
    void testTemperatureConverter_C_to_K() {
        TemperatureConverter tc = new TemperatureConverter();
        assertEquals(273.15, tc.convert(0, "C", "K"), 0.001);
    }

    @Test
    //4
    void testUniversalConverter_withIntegratedModules() {
        UniversalConverter uc = new UniversalConverter();
        double result = uc.convert(2, "Distance", "kilometer", "mile");
        assertEquals(1.242, result, 0.001);
    }
}

