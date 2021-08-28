/*Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
Output:
Enter the number 5
Enter the power 2
Result: 25
*/

import java.util.Scanner;

public class Power
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int base;
        int power;
        int result = 1;
        
        System.out.print("Enter the number ");
        base = console.nextInt();
        
        System.out.print("Enter the power ");
        power = console.nextInt();

        for(int i = 1; i <= power; i++)
        {
	    result *= base;
        }

        System.out.println("Result: "+ result);
    }
}