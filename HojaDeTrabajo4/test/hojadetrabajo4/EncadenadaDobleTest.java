/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojadetrabajo4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Irene
 */
public class EncadenadaDobleTest {
    
    public EncadenadaDobleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addFirst method, of class EncadenadaDoble.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        EncadenadaDoble instance = new EncadenadaDoble();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class EncadenadaDoble.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        EncadenadaDoble instance = new EncadenadaDoble();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class EncadenadaDoble.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        EncadenadaDoble instance = new EncadenadaDoble();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class EncadenadaDoble.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        EncadenadaDoble instance = new EncadenadaDoble();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
