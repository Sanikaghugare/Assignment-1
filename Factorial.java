/*Write a program to find the factorial value of any number entered through the keyboard. 
Output:
Enter any positive integer: 5
Factorial: 120
*/

import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int num; 
        int fact = 1;         
        System.out.print("Enter any positive integer: ");
        num =s.nextInt();       
        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }        
        System.out.println("Factorial: "+ fact);
    }
} 