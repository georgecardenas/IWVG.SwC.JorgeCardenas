package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;
    
    @Before
    public void before() {
        user = new User(10, "Pepe", "Toscano");
    }

    @Test
    public void testUser() {
        assertEquals(10, user.getNumber());
        assertEquals("Pepe", user.getName());
        assertEquals("Toscano", user.getFamilyName());
    }

    @Test
    public void testGetNumber() {
        assertEquals(10, user.getNumber());
    }

    @Test
    public void testGetName() {
        assertEquals("Pepe", user.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals("Toscano", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Pepe Toscano", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("P. T.", user.initials());
    }

}
