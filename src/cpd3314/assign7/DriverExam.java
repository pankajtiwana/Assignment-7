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

/* The following exercises are adapted from: 
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through  
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-285583-9 
 */

package cpd3314.assign7;

import java.util.ArrayList;

/* Exercise #5 - Driver's License Exam
 *
 * The local Driver's License Office has asked you to write a program that
 * grades the written portion of the driver's license exam. The exam has 20
 * multiple choice questions. Here are the correct answer:
 * 1. B     6. A        11. B       16. C
 * 2. D     7. B        12. C       17. C
 * 3. A     8. A        13. D       18. B
 * 4. A     9. C        14. A       19. D
 * 5. C     10. D       15. D       20. A
 * A student must correctly answer 15 of the 20 questions to pass the exam. 
 * Write a class named DriverExam that holds the correct answers to the exam in 
 * an array field. The class should also have an array field that holds the 
 * student's answers. 
 * The class should have the following methods:
 * - setAnswer(int, char) that sets a student answer the given value. For 
 *     example, setAnswer(4, 'C') would store C as the answer to the 4th 
 *     question. Note that the first question is #1 (not 0).
 * - passed() that returns true if the student answered at least 15/20 correct
 * - totalCorrect() that returns the number of correctly answered questions
 * - totalIncorrect() that returns the number of incorrectly answered questions
 * - questionsMissed() that returns an integer array containing the question
 *     numbers of the questions that the student missed. Note that the first
 *     question is #1 (not 0).
 *
 * - Gaddis pg. 491
 */
/**
 * @author Pankaj
 */
public class DriverExam {
    int countcorrect=0;
    int countincorrect=0;
    ArrayList missed=new ArrayList();
    //int missed[]=new int[20];
    char correctanswers[]={'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
        'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
    char useranswers[]=new char[20];
    public void setAnswer(int ansnum, char ans)
    {
     this.useranswers[ansnum-1]=ans;   
    }
    public boolean passed()
    {
        for(int i=0; i<correctanswers.length;i++)
        {
            if(correctanswers[i]==useranswers[i])
            {
                countcorrect+=1;
            }
        }
        return countcorrect>=15;
    }
    public int totalCorrect()
    {
         for(int i=0; i<correctanswers.length;i++)
        {
            if(correctanswers[i]==useranswers[i])
            {
                countcorrect+=1;
            }
        }
         return countcorrect;
    }
    
    public int totalIncorrect()
    {
         for(int i=0; i<correctanswers.length;i++)
        {
            if(correctanswers[i]!=useranswers[i])
            {
                countincorrect+=1;
            }
        }
         return countincorrect;
    }
    public int[] questionsMissed()
    {
        
        for(int i=0; i<correctanswers.length;i++)
        {
            if(correctanswers[i]!=useranswers[i])
            {
                 missed.add(i+1);
                
            }
        } 
         int miss[]= new int[missed.size()];
                 for(int j=0;  j<miss.length; j++)
                 {
                    miss[j]=(int) missed.get(j);
                 }
        return miss;
    }

}
