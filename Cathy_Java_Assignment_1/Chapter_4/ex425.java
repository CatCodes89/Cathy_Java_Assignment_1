/*
4.25 What does the following program print?
 */

 public class ex425{
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10) {
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        }
    }
 }

/* 
This program prints a pattern of alternating lines of asterisks and plus signs.
The loop starts with count initialized to 1.
In each iteration of the loop, it checks if count % 2 == 1, 
which determines if count is odd. If count is odd, it prints "****",
otherwise, it prints "++++++++".
After printing, count is incremented by 1.
The loop continues until count reaches 10.
Each line alternates between "****" and "++++++++", totaling 10 lines.
*/ 

/* 
Output would look like:

****
++++++++
****
++++++++
****
++++++++
****
++++++++
****
++++++++
*/