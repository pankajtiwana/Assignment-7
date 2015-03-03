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
public class DriverExamTest {

    private char[] correct = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
        'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
    private char[] firstTenCorrect = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
        'C', 'D', 'A', 'B', 'A', 'D', 'D', 'C', 'A', 'B'};
    private char[] firstFifteenCorrect = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
        'B', 'C', 'D', 'A', 'D', 'D', 'D', 'C', 'A', 'B'};

    public DriverExamTest() {
    }

    /**
     * Test of passed method, of class DriverExam.
     */
    @Test
    public void testPassedNoInput() {
        System.out.println("passed");
        DriverExam instance = new DriverExam();
        boolean expResult = false;
        boolean result = instance.passed();
        assertEquals("The passed() method gives the wrong result when no answers are set",
                expResult, result);
    }

    /**
     * Test of passed method, of class DriverExam.
     */
    @Test
    public void testPassedCorrect() {
        System.out.println("passed");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < correct.length; i++) {
            instance.setAnswer(i + 1, correct[i]);
        }
        boolean expResult = true;
        boolean result = instance.passed();
        assertEquals("The passed() method gives the wrong result with 100% correct answers",
                expResult, result);
    }

    /**
     * Test of passed method, of class DriverExam.
     */
    @Test
    public void testPassed10Correct() {
        System.out.println("passed");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < firstTenCorrect.length; i++) {
            instance.setAnswer(i + 1, firstTenCorrect[i]);
        }
        boolean expResult = false;
        boolean result = instance.passed();
        assertEquals("The passed() method gives the wrong result with 50% correct answers",
                expResult, result);
    }

    /**
     * Test of passed method, of class DriverExam.
     */
    @Test
    public void testPassed15Correct() {
        System.out.println("passed");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < firstFifteenCorrect.length; i++) {
            instance.setAnswer(i + 1, firstFifteenCorrect[i]);
        }
        boolean expResult = true;
        boolean result = instance.passed();
        assertEquals("The passed() method gives the wrong result with 75% correct answers",
                expResult, result);
    }

    /**
     * Test of totalCorrect method, of class DriverExam.
     */
    @Test
    public void testTotalCorrectNoInput() {
        System.out.println("totalCorrect");
        DriverExam instance = new DriverExam();
        int expResult = 0;
        int result = instance.totalCorrect();
        assertEquals("The totalCorrect() method gives the wrong result when no answers are set",
                expResult, result);
    }

    /**
     * Test of totalCorrect method, of class DriverExam.
     */
    @Test
    public void testTotalCorrect10() {
        System.out.println("totalCorrect");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < firstTenCorrect.length; i++) {
            instance.setAnswer(i + 1, firstTenCorrect[i]);
        }
        int expResult = 10;
        int result = instance.totalCorrect();
        assertEquals("The totalCorrect() method gives the wrong result with 50% correct answers",
                expResult, result);
    }

    /**
     * Test of totalCorrect method, of class DriverExam.
     */
    @Test
    public void testTotalCorrect15() {
        System.out.println("totalCorrect");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < firstFifteenCorrect.length; i++) {
            instance.setAnswer(i + 1, firstFifteenCorrect[i]);
        }
        int expResult = 15;
        int result = instance.totalCorrect();
        assertEquals("The totalCorrect() method gives the wrong result with 75% correct answers",
                expResult, result);
    }

    /**
     * Test of totalCorrect method, of class DriverExam.
     */
    @Test
    public void testTotalCorrect20() {
        System.out.println("totalCorrect");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < correct.length; i++) {
            instance.setAnswer(i + 1, correct[i]);
        }
        int expResult = 20;
        int result = instance.totalCorrect();
        assertEquals("The totalCorrect() method gives the wrong result with 100% correct answers",
                expResult, result);
    }

    /**
     * Test of totalCorrect method, of class DriverExam.
     */
    @Test
    public void testTotalIncorrectNoInput() {
        System.out.println("totalIncorrect");
        DriverExam instance = new DriverExam();
        int expResult = 20;
        int result = instance.totalIncorrect();
        assertEquals("The totalIncorrect() method gives the wrong result when no answers are set",
                expResult, result);
    }

    /**
     * Test of totalCorrect method, of class DriverExam.
     */
    @Test
    public void testTotalIncorrect10() {
        System.out.println("totalIncorrect");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < firstTenCorrect.length; i++) {
            instance.setAnswer(i + 1, firstTenCorrect[i]);
        }
        int expResult = 10;
        int result = instance.totalIncorrect();
        assertEquals("The totalIncorrect() method gives the wrong result with 50% correct answers",
                expResult, result);
    }

    /**
     * Test of totalCorrect method, of class DriverExam.
     */
    @Test
    public void testTotalIncorrect15() {
        System.out.println("totalIncorrect");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < firstFifteenCorrect.length; i++) {
            instance.setAnswer(i + 1, firstFifteenCorrect[i]);
        }
        int expResult = 5;
        int result = instance.totalIncorrect();
        assertEquals("The totalIncorrect() method gives the wrong result with 75% correct answers",
                expResult, result);
    }

    /**
     * Test of totalCorrect method, of class DriverExam.
     */
    @Test
    public void testTotalIncorrect20() {
        System.out.println("totalIncorrect");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < correct.length; i++) {
            instance.setAnswer(i + 1, correct[i]);
        }
        int expResult = 0;
        int result = instance.totalIncorrect();
        assertEquals("The totalIncorrect() method gives the wrong result with 100% correct answers",
                expResult, result);
    }

    /**
     * Test of questionsMissed method, of class DriverExam.
     */
    @Test
    public void testQuestionsMissedNoInput() {
        System.out.println("questionsMissed");
        DriverExam instance = new DriverExam();
        int[] expResult = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] result = instance.questionsMissed();
        assertArrayEquals("The questionsMissed() method gives the wrong result with no answers input",
                expResult, result);
    }

    /**
     * Test of questionsMissed method, of class DriverExam.
     */
    @Test
    public void testQuestionsMissed10() {
        System.out.println("questionsMissed");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < firstTenCorrect.length; i++) {
            instance.setAnswer(i + 1, firstTenCorrect[i]);
        }
        int[] expResult = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] result = instance.questionsMissed();
        assertArrayEquals("The questionsMissed() method gives the wrong result with first ten answers correct",
                expResult, result);
    }
    /**
     * Test of questionsMissed method, of class DriverExam.
     */
    @Test
    public void testQuestionsMissed15() {
        System.out.println("questionsMissed");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < firstFifteenCorrect.length; i++) {
            instance.setAnswer(i + 1, firstFifteenCorrect[i]);
        }
        int[] expResult = {16, 17, 18, 19, 20};
        int[] result = instance.questionsMissed();
        assertArrayEquals("The questionsMissed() method gives the wrong result with first fifteen answers correct",
                expResult, result);
    }
    /**
     * Test of questionsMissed method, of class DriverExam.
     */
    @Test
    public void testQuestionsMissed20() {
        System.out.println("questionsMissed");
        DriverExam instance = new DriverExam();
        for (int i = 0; i < correct.length; i++) {
            instance.setAnswer(i + 1, correct[i]);
        }
        int[] expResult = {};
        int[] result = instance.questionsMissed();
        assertArrayEquals("The questionsMissed() method gives the wrong result with all answers correct",
                expResult, result);
    }

}
