/*Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
Output:
Enter any positive integer: 8
Multiplication Table of 8
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80
*/

import java.util.Scanner;

public class Table
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
    }
}