/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 * Updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cpd3314.assign7;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class ArrayUtil2DTest {

    private double[][] dummy = {
        {1.0, 2.0, 3.0},
        {4.0, 5.0, 6.0},
        {7.0, 8.0, 9.0}
    };

    public ArrayUtil2DTest() {
    }

    /**
     * Test of getTotal method, of class ArrayUtil2D.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        double[][] arr = dummy;
        ArrayUtil2D instance = new ArrayUtil2D();
        double expResult = 45.0;
        double result = instance.getTotal(arr);
        assertEquals("getTotal() is providing the wrong answer", expResult, result, 0.0001);
    }

    /**
     * Test of getAverage method, of class ArrayUtil2D.
     */
    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        double[][] arr = dummy;
        ArrayUtil2D instance = new ArrayUtil2D();
        double expResult = 5.0;
        double result = instance.getAverage(arr);
        assertEquals("getAverage() is providing the wrong answer", expResult, result, 0.0001);
    }

    /**
     * Test of getRowTotal method, of class ArrayUtil2D.
     */
    @Test
    public void testGetRowTotal() {
        System.out.println("getRowTotal");
        double[][] arr = dummy;
        int row = 2;
        ArrayUtil2D instance = new ArrayUtil2D();
        double expResult = 24.0;
        double result = instance.getRowTotal(arr, row);
        assertEquals("getRowTotal() is providing the wrong answer", expResult, result, 0.0001);
    }

    /**
     * Test of getColumnTotal method, of class ArrayUtil2D.
     */
    @Test
    public void testGetColumnTotal() {
        System.out.println("getColumnTotal");
        double[][] arr = dummy;
        int col = 1;
        ArrayUtil2D instance = new ArrayUtil2D();
        double expResult = 15.0;
        double result = instance.getColumnTotal(arr, col);
        assertEquals("getColumnTotal() is providing the wrong answer", expResult, result, 0.0001);
    }

    /**
     * Test of getHighestInRow method, of class ArrayUtil2D.
     */
    @Test
    public void testGetHighestInRow() {
        System.out.println("getHighestInRow");
        double[][] arr = dummy;
        int row = 1;
        ArrayUtil2D instance = new ArrayUtil2D();
        double expResult = 6.0;
        double result = instance.getHighestInRow(arr, row);
        assertEquals("getHighestInRow() is providing the wrong answer", expResult, result, 0.0001);
    }

    /**
     * Test of getLowestInRow method, of class ArrayUtil2D.
     */
    @Test
    public void testGetLowestInRow() {
        System.out.println("getLowestInRow");
        double[][] arr = dummy;
        int row = 2;
        ArrayUtil2D instance = new ArrayUtil2D();
        double expResult = 7.0;
        double result = instance.getLowestInRow(arr, row);
        assertEquals("getLowestInRow() is providing the wrong answer", expResult, result, 0.0001);
    }

}
