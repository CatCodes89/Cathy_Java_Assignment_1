/*
4.26 What does the following program print?
 */

 public class ex426{
    public static void main(String[] args){
        int row = 10;
        while (row >= 1) {
            int column = 1;
            while (column <= 10) {
                System.out.print(row % 2 == 1 ? "<" : ">");
                ++column;
            }
            --row;
            System.out.println();
        }
    }
 }

 /* 
This program prints a pattern of alternating characters in each row. 
Inside the nested loops, the outer loop iterates from row = 10 to row = 1.
For each row, the inner loop iterates from column = 1 to column = 10.
In each iteration of the inner loop, it checks if row % 2 == 1, which 
determines if row is odd. If row is odd, it prints "<", otherwise, it prints ">".
After printing a row of characters, row is decremented by 1.
The program continues this process until row becomes 0.
*/ 

/* 
Output would look like:

>>>>>>>>>>
<<<<<<<<<<
>>>>>>>>>>
<<<<<<<<<<
>>>>>>>>>>
<<<<<<<<<<
>>>>>>>>>>
<<<<<<<<<<
>>>>>>>>>>
<<<<<<<<<<
*/