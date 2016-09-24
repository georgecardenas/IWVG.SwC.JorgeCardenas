package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fraction;

    @Before
    public void before() {
        fraction = new Fraction(2, 3);
    }
    
    @Test
    public void testFractionIntInt() {
        assertEquals(2, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }
    
    @Test
    public void testGetNumerator() {
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(3, fraction.getDenominator());
    }
    

    @Test
    public void testDecimal() {
        assertEquals((double)2/3, fraction.decimal(),10e-5);
    }

}
