/*
2.26 (Multiples) Write an application that reads two integers, determines 
whether the first is a multiple of the second and prints the result.
[Hint: Use the remainder operator.]
 */

 import java.util.Scanner;

 public class ex226 {
     public static void main(String[] args) {
 
         Scanner input = new Scanner(System.in);
         int firstNumber;
         int secondNumber;
 
         System.out.print("Enter a number: ");
         firstNumber = input.nextInt();
 
         System.out.print("Enter another number: ");
         secondNumber = input.nextInt();
 
         if (firstNumber % secondNumber == 0)
             System.out.println(firstNumber + " is a multiple of " + secondNumber);
         else if (secondNumber % firstNumber == 0)
             System.out.println(secondNumber + " is a multiple of " + firstNumber);
         else
             System.out.println("Neither number is a multiple of the other.");
 
         input.close();
     }
 } 