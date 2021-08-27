/*Write a program in JAVA to compute quotient and remainder.   
Sample Output:
Compute quotient and remainder :
-------------------------------------
Input the dividend : 25
Input the divisor : 3
The quotient of the division is : 8
The remainder of the division is : 1
 */
 
import java.util.Scanner;
public class QuoRem {
    public static void main(String[] args){ 
    System.out.println("Compute quotient and remainder : ");
    System.out.println("----------------------------------------");
        int dividend, divisor, quo, rem;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the dividend:");
        dividend = in.nextInt();
        System.out.print("Input the divisor:");
        divisor = in.nextInt();
        quo = dividend / divisor;
        rem = dividend % divisor;
        System.out.println("The quotient of the division is : "+quo);
        System.out.println("The remainder of the division is : "+rem);
    }
}