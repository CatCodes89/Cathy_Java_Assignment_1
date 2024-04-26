/*
5.13 (Factorials) Factorials are used frequently in 
probability problems. The factorial of a positive 
integer n (written n! and pronounced “n factorial”) 
is equal to the product of the positive integers 
from 1 to n. Write an application that calculates 
the factorials of 1 through 20. Use type long. 
Display the results in tabular format. What difficulty
 might prevent you from calculating the factorial of 100?
 */

 public class ex513 {
    public static void main(String[] args) {
        long factorial = 1;

        System.out.printf("%-5s%s%n", "Number", "Factorial");
        for (int number = 1; number <= 20; number++) {
            factorial *= number;
            System.out.printf("%-5d%s%n", number, factorial);
        }
    }
}

/*
Calculating the factorial of 100 poses a challenge due to the 
limitations of data types in Java. Even with the long data type, 
which can store relatively large numbers, the factorial of 100 
exceeds its capacity. The factorial of 100 is a very large number 
with 158 digits. To accurately calculate factorials of such large 
numbers, specialized libraries or algorithms designed to handle 
arbitrary-precision arithmetic, such as BigInteger in Java, would be required.
 */