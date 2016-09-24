package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    private DecimalCollection collection;

    @Before
    public void before() {
        collection = new DecimalCollection();
    }
    
    @Test
    public void testDecimalCollection() {
        assertEquals(0, collection.size());
    }

    @Test
    public void testAdd() {
        collection.add(5.0f);
        assertEquals(1, collection.size());
    }

    @Test
    public void testSize() {
        collection.add(5.0f);
        collection.add(6.0f);
        assertEquals(2, collection.size());
    }

    @Test
    public void testSum() {
        collection.add(5.0f);
        collection.add(6.0f);
        assertEquals(5.0f + 6.0f, collection.sum(), 10e-5);
    }

    @Test
    public void testHigher() {
        fail("Not yet implemented");
    }

}
