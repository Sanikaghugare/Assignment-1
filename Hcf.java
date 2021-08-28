/*Write a program to calculate HCF of Two given number.
Output:
Enter the first number 9
Enter the second number 7
HCF: 1
*/

import java.util.Scanner;

public class Hcf
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int dividend, divisor;
        int remainder, hcf = 0;
        
        System.out.print("Enter the first number ");
        dividend = console.nextInt();
        
        System.out.print("Enter the second number ");
        divisor = console.nextInt();        
        
        do
	{
            remainder = dividend % divisor;
            
            if(remainder == 0)
            {
                hcf = divisor;
            }
	    else
            {
                dividend = divisor;
                divisor = remainder;
	    }
            
        }while(remainder != 0);

        System.out.println("HCF: " + hcf);
    }  
}