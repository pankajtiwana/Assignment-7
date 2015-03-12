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

import java.util.Scanner;

/**
 * @author <ENTER YOUR NAME HERE>
 */
public class CPD3314Assign7 {
    
     static double total=0;
     static int row;
     static int col;
    
    public static void doExercise1()
       {
           Scanner in =new Scanner(System.in);
           System.out.println("Enter the number of rows and columns");
           row=in.nextInt();
           col=in.nextInt();
           double array[][]=new double[row][col];
           System.out.println("enter the vlues of the array");
           for(int i=0; i<array.length; i++)
           {
               for (int j=0; j<array[i].length; j++)
               {
                  array[i][j]=in.nextInt();
               }
           }
           
           
           
                
        ArrayUtil2D arrayObj = new ArrayUtil2D();
      total= arrayObj.getTotal(array);
      System.out.println(total);
       }
    public static void doExercise2()
       {
           Scanner in =new Scanner(System.in);
           System.out.println("Enter the number of rows and columns");
           row=in.nextInt();
           col=in.nextInt();
           double array[][]=new double[row][col];
           System.out.println("enter the vlues of the array");
           for(int i=0; i<array.length; i++)
           {
               for (int j=0; j<array[i].length; j++)
               {
                  array[i][j]=in.nextInt();
               }
           }
           
           
           
                
        ArrayUtil2D arrayObj = new ArrayUtil2D();
      total= arrayObj.getAverage(array);
      System.out.println(total);
       }
    public static void doExercise3()
       {
           Scanner in =new Scanner(System.in);
           System.out.println("Enter the number of rows and columns");
           row=in.nextInt();
           col=in.nextInt();
           double array[][]=new double[row][col];
           System.out.println("enter the vlues of the array");
           for(int i=0; i<array.length; i++)
           {
               for (int j=0; j<array[i].length; j++)
               {
                  array[i][j]=in.nextInt();
               }
           }
           System.out.println("Now enter a row number to calculate the vlues for");
           int r=in.nextInt();
           while(r>row-1)
           {
               System.out.println("row exceeds the total number of rows in array please neter again");
               r=in.nextInt();
           }
           
           
           
                
        ArrayUtil2D arrayObj = new ArrayUtil2D();
      total= arrayObj.getRowTotal(array, r);
      System.out.println(total);
       }

    
     public static void doExercise4()
       {
           Scanner in =new Scanner(System.in);
           System.out.println("Enter the number of rows and columns");
           row=in.nextInt();
           col=in.nextInt();
           double array[][]=new double[row][col];
           System.out.println("enter the vlues of the array");
           for(int i=0; i<array.length; i++)
           {
               for (int j=0; j<array[i].length; j++)
               {
                  array[i][j]=in.nextInt();
               }
           }
           System.out.println("Now enter a column number to calculate the vlues for");
           int c=in.nextInt();
           while(c>col-1)
           {
               System.out.println("column exceeds the total number of rows in array please neter again");
               c=in.nextInt();
           }
           
           
           
                
        ArrayUtil2D arrayObj = new ArrayUtil2D();
      total= arrayObj.getColumnTotal(array, c);
      System.out.println(total);
       }

     public static void doExercise5()
       {
           Scanner in =new Scanner(System.in);
           System.out.println("Enter the number of rows and columns");
           row=in.nextInt();
           col=in.nextInt();
           double array[][]=new double[row][col];
           System.out.println("enter the vlues of the array");
           for(int i=0; i<array.length; i++)
           {
               for (int j=0; j<array[i].length; j++)
               {
                  array[i][j]=in.nextInt();
               }
           }
           System.out.println("Now enter a row number to calculate the highest value for");
           int c=in.nextInt();
           while(c>col-1)
           {
               System.out.println("row exceeds the total number of rows in array please neter again");
               c=in.nextInt();
           }
           
           
           
                
        ArrayUtil2D arrayObj = new ArrayUtil2D();
      total= arrayObj.getHighestInRow(array, c);
      System.out.println(total);
       }
     
     public static void doExercise6()
       {
           Scanner in =new Scanner(System.in);
           System.out.println("Enter the number of rows and columns");
           row=in.nextInt();
           col=in.nextInt();
           double array[][]=new double[row][col];
           System.out.println("enter the vlues of the array");
           for(int i=0; i<array.length; i++)
           {
               for (int j=0; j<array[i].length; j++)
               {
                  array[i][j]=in.nextInt();
               }
           }
           System.out.println("Now enter a row number to calculate the lowest vlues for");
           int r=in.nextInt();
           while(r>row-1)
           {
               System.out.println("row exceeds the total number of rows in array please neter again");
               r=in.nextInt();
           }
           
           
           
                
        ArrayUtil2D arrayObj = new ArrayUtil2D();
      total= arrayObj.getLowestInRow(array, r);
      System.out.println(total);
       }
     public static void doExercise7()
       {
           DriverExam arrayObj = new DriverExam();
           Scanner in=new Scanner(System.in);
           char answers[]=new char[20];
           System.out.println("enter the answers for the twenty questions");
           for(int i=1; i<=20; i++)
           {
               String ans=in.nextLine();
               char a=ans.charAt(0);
               arrayObj.setAnswer(i, a);
                  
               
           }
          
           boolean passed=arrayObj.passed();
           if(passed)
           {
               System.out.println("you passed");
           }
           else
           {
               System.out.println("you failed");
           }
          
           int correct=arrayObj.totalCorrect();
           System.out.println("your Total Correct answers are : "+correct);
           int incorrect=arrayObj.totalIncorrect();
           System.out.println("your total incorrect answers are: "+incorrect);
           int miss[]=arrayObj.questionsMissed();
           System.out.println("your Incoorect answres are: ");
           for(int i=0; i<miss.length; i++)
           {
               System.out.println(miss[i]);
           }
           
           
                
        
      
       }
     
      public static void doExercise8()
       {
           RainFall arrayObj = new RainFall();
           Scanner in=new Scanner(System.in);
           
           System.out.println("enter the rainfalls for 12 months");
           for(int i=0; i<12; i++)
           {
               double fall=in.nextDouble();
               
               arrayObj.setRainfall(i, fall);
                  
               
           }
          
           double total= arrayObj.getTotal();
           System.out.println("total rain fall in the year is: "+total);
           
           double avg=arrayObj.getAverage();
           
              System.out.println("the average rain fall in the year is: "+avg);
              
              int maxmonth=arrayObj.getMax();
                 System.out.println("max rain fall was " +(maxmonth+1)+" month");
                 int minmonth=arrayObj.getMin();
                 System.out.println("min rain fall was " +(minmonth+1)+" month");
         
           
           
                
        
      
       }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int choice;
        System.out.println("Enter your choice:");
        System.out.println("1.get total of an array\n"
                + "2. get the average of an array\n"
                + "3. get total values in any row of an array\n"
                + "4. get the total value in any column in a array\n"
                + "5. get the highest value in any given row\n"
                + "6. get the highest value in any given column\n"
                 + "7. Driver Test Exam:\n"
                + "8. Rain Fall");
        Scanner in=new Scanner(System.in);
        choice=in.nextInt();
        switch(choice)
        {
            case 1:
                doExercise1();
                break;
            case 2:
               doExercise2();
                break;
            case 3:
                doExercise3();
                break;
            case 4:
               doExercise4();
                break;
            case 5:
               doExercise5();
                break;
            case 6:
                doExercise6();
                break;
            case 7:
                doExercise7();
                break;
                case 8:
                doExercise8();
                break;
            default:
                System.out.println("enter the right value");
                
        }
        
        
        /* This is a sandbox. Use it to instantiate your classes and manually
         * test their functionality. You are not required to put any code here.
         * It's only provided to give you a launch point. If you can pass all
         * the unit tests without changing this file, that's okay.
        
         */
        double array[][]=new double[][]{
        {1.0, 2.0, 3.0},
        {4.0, 5.0, 6.0},
        {7.0, 8.0, 9.0}
    };
        
        
       
    
    }
        
        //double[][][][] arr = null;
        
    }
    

