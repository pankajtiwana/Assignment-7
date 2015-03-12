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

/* Exercise #15 - 2D Array Operations
 * 
 * The methods of this class are going to be fed two-dimensional arrays of 
 * doubles. Write methods within this class to perform the following tasks:
 * - getTotal(double[][]) This method should accept a two-dimensional array as 
 *     its argument and return the total of all the values in the array. 
 * - getAverage(double[][]) This method should accept a two-dimensional array as
 *     its argument and return the average of all the values in the array.
 * - getRowTotal(double[][], int) This method should accept a two-dimensional
 *     array as its first argument, and an integer as its second argument. The
 *     second argument should be the subscript of a row in the array. The method
 *     should return the total of the values in the specified row.
 * - gotColumnTotal(double[][], int) This method should accept a two-dimensional
 *     array as its first argument, and an integer as its second argument. The
 *     second argument should be the subscript of a column in the array. The 
 *     method should return the total of the values in the specified column.
 * - getHighestInRow(double[][], int) This method should accept a two-dimensional
 *     array as its first argument, and an integer as its second argument. The
 *     second argument should be the subscript of a row in the array. The method
 *     should return the highest value in the specified row of the array.
 * - getLowestInRow(double[][], int) This method should accept a two-dimensional
 *     array as its first argument, and an integer as its second argument. The
 *     second argument should be the subscript of a row in the array. The method
 *     should return the lowest value in the specified row of the array.
 *
 * - Gaddis pg. 495
 */

/**
 * @author <ENTER YOUR NAME HERE>
 */
public class ArrayUtil2D {
    double arr[][]=new double[100][100];
    double total=0;
    int count=0;
    //int row=0;
    //int col=0;
    public double getTotal(double arr[][])
    {
       //this.arr=arr;
       for(int i=0; i<arr.length; i++)
       {
           
           for(int j=0; j<arr[i].length; j++)
           {
           total=total+arr[i][j];
                   }
       }
       return total;
    }
    
    public double getAverage(double arr[][])
    {
       // this.arr=arr;
        for(int i=0; i<arr.length; i++)

        {
         for (int j=0; j<arr[i].length; j++)  
         {
             count=count+1;
             total=total+arr[i][j];
         }
             
         }
        return total/count;
        }
    public double getRowTotal(double arr[][], int row)
    {
        //System.out.println(arr[row-1].length);
       // this.arr=arr;
       // this.row=row;
        
        for(int i=0; i<arr[row].length; i++)
        {
            //System.out.println(arr[row].length);
            total=total+arr[row][i];
        }
        return total;
        
    }
    
    public double getColumnTotal(double arr[][], int col)
    {
        //System.out.println(arr[row-1].length);
       // this.arr=arr;
        //this.col=col;
        for(int i=0; i<arr[col].length; i++)
        {
            //System.out.println(arr[row].length);
            total=total+arr[i][col];
        }
        return total;
        
    }
    
     public double getHighestInRow(double arr[][], int row)
    {
        //System.out.println(arr[row-1].length);
       // this.arr=arr;
       // this.row=row;
        double high=arr[row][0];
        for(int i=0; i<arr[row].length; i++)
        {
            //System.out.println(arr[row].length);
            if(arr[row][i]> high)
            {
                high=arr[row][i];
            }
           
        }
        return high;
        
    }
     public double getLowestInRow(double arr[][], int row)
    {
        //System.out.println(arr[row-1].length);
       // this.arr=arr;
       // this.row=row;
        double low=arr[row][0];
        for(int i=0; i<arr[row].length; i++)
        {
            //System.out.println(arr[row].length);
            if(arr[row][i]< low)
            {
                low=arr[row][i];
            }
           
        }
        return low;
        
    }
    
    
}
