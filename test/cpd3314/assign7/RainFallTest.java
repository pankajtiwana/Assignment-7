/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
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
public class RainFallTest {

    private double[] dummy = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public RainFallTest() {
    }

    /**
     * Test of setRainfall method, of class RainFall.
     */
    @Test
    public void testSetAndGetRainfall() {
        System.out.println("setRainfall");
        int mo = 0;
        double val = 0.0;
        double expected = 0.0;
        RainFall instance = new RainFall();
        instance.setRainfall(mo, val);
        double result = instance.getRainfall(mo);
        assertEquals("Set and Get Do Not Match", expected, result, 0.0001);
    }

    /**
     * Test of getTotal method, of class RainFall.
     */
    @Test
    public void testGetTotalZero() {
        System.out.println("getTotal");
        RainFall instance = new RainFall();
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals("getTotal() does not return zero when no setters called",
                expResult, result, 0.0001);
    }

    /**
     * Test of getTotal method, of class RainFall.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        RainFall instance = new RainFall();
        for (int i = 0; i < dummy.length; i++) {
            instance.setRainfall(i, dummy[i]);
        }
        double expResult = 78.0;
        double result = instance.getTotal();
        assertEquals("getTotal() does not return expected value",
                expResult, result, 0.0001);
    }

    /**
     * Test of getAverage method, of class RainFall.
     */
    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        RainFall instance = new RainFall();
        for (int i = 0; i < dummy.length; i++) {
            instance.setRainfall(i, dummy[i]);
        }
        double expResult = 6.5;
        double result = instance.getAverage();
        assertEquals("getTotal() does not return expected value", expResult,
                result, 0.0001);
    }

    /**
     * Test of getMax method, of class RainFall.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        RainFall instance = new RainFall();
        for (int i = 0; i < dummy.length; i++) {
            instance.setRainfall(i, dummy[i]);
        }
        double expResult = 12.0;
        double result = instance.getMax();
        assertEquals("getMax() does not return expected value", expResult,
                result, 0.0001);
    }

    /**
     * Test of getMin method, of class RainFall.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        RainFall instance = new RainFall();
        for (int i = 0; i < dummy.length; i++) {
            instance.setRainfall(i, dummy[i]);
        }
        double expResult = 1.0;
        double result = instance.getMin();
        assertEquals("getMin() does not return expected value", expResult,
                result, 0.0001);
    }

}
