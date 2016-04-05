/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blake.turner352
 */
public class BrickTest {
    
    public BrickTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSurfaceArea method, of class Brick.
     */
    @Test
    public void testGetSurfaceArea() {
        System.out.println("getSurfaceArea");
        Brick instance = new Brick(1, 1, 1);
        double expResult = 6.0;
        double result = instance.getSurfaceArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Brick.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Brick instance = new Brick(1, 1, 1);
        double expResult = 2.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVolume method, of class Brick.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Brick instance = new Brick(1, 1, 1);
        int expResult = 1;
        int result = instance.getVolume();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Brick.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Brick instance = new Brick(1, 1, 1);
        double expResult = 1.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
