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
public class EncadenadaSimpleTest {
    
    public EncadenadaSimpleTest() {
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
     * Test of size method, of class Circular.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Circular instance = new Circular();
        instance.addFirst(String.valueOf(10));
        instance.addFirst(String.valueOf(20));
        instance.addLast(String.valueOf(15));
        Object result = String.valueOf(instance.size());
        Object expResult = String.valueOf(3);
        System.out.println("add: 10,20,15 / size:"+result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class Circular.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        EncadenadaSimple instance = new EncadenadaSimple();
        instance.addFirst(String.valueOf(10));
        instance.addLast(String.valueOf(15));
        Object result = String.valueOf(instance.removeFirst());
        Object expResult = String.valueOf(10);
        System.out.println("add: 10,15 / remove first:"+result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class EncadenadaSimple.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        EncadenadaSimple instance = new EncadenadaSimple();
        instance.addFirst(String.valueOf(10));
        instance.addFirst(String.valueOf(20));
        instance.addLast(String.valueOf(15));
        Object result = String.valueOf(instance.removeFirst());
        Object result2 = String.valueOf(instance.removeLast());
        Object expResult = String.valueOf(10);
        System.out.println("add first: 10, add first: 20, add last: 15 / RemoveFirst:"+result+" RemoveLast:"+result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of addLast method, of class EncadenadaSimple.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        EncadenadaSimple instance = new EncadenadaSimple();
        instance.addFirst(String.valueOf(10));
        instance.addLast(String.valueOf(15));
        Object result = String.valueOf(instance.removeLast());
        Object expResult = String.valueOf(15);
        System.out.println("add: 10,15 / remove last:"+result);
    }

    /**
     * Test of removeLast method, of class EncadenadaSimple.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        EncadenadaSimple instance = new EncadenadaSimple();
        instance.addFirst(String.valueOf(10));
        instance.addFirst(String.valueOf(12));
        instance.addLast(String.valueOf(15));
        Object result = String.valueOf(instance.removeLast());
        Object expResult = String.valueOf(15);
        System.out.println("add first: 10, add first: 12, add last: 15 / remove last:"+result);
    }
    
}
