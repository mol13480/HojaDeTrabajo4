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
        instance.addFirst(String.valueOf(10));
        instance.addFirst(String.valueOf(15));
        Object result = String.valueOf(instance.removeLast());
        Object expResult = String.valueOf(15);
        System.out.println("add first: 10, add first: 15 / remove last:"+result);
    }

    /**
     * Test of addLast method, of class EncadenadaDoble.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        EncadenadaDoble instance = new EncadenadaDoble();
        instance.addFirst(String.valueOf(10));
        instance.addLast(String.valueOf(15));
        Object result = String.valueOf(instance.removeLast());
        Object expResult = String.valueOf(15);
        System.out.println("add first: 10, add last: 15 / remove last:"+result);
    }

    /**
     * Test of removeLast method, of class EncadenadaDoble.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        EncadenadaDoble instance = new EncadenadaDoble();
        instance.addFirst(String.valueOf(10));
        instance.addFirst(String.valueOf(15));
        instance.addLast(String.valueOf(20)); 
        Object result = String.valueOf(instance.removeLast());
        Object expResult = String.valueOf(15);
        System.out.println("add first: 10, add first: 15, add last: 20 / remove last:"+result);
    }

    /**
     * Test of size method, of class EncadenadaDoble.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        EncadenadaDoble instance = new EncadenadaDoble();
        instance.addFirst(String.valueOf(10));
        instance.addLast(String.valueOf(15));
        Object result = String.valueOf(instance.size());
        Object expResult = String.valueOf(2);
        System.out.println("add first: 10, add last: 15 / size:"+result);
    }
    
}
