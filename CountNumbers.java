/*Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
Output:
Enter the number 6
Do you want to continue y/n? y
Enter the number -7
Do you want to continue y/n? y
Enter the number 0
Do you want to continue y/n? n
Positive numbers: 1
Negative numbers: 1
Zero numbers: 1
*/

import java.util.Scanner;


public class CountNumbers
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number,          
            countPositive = 0, 
            countNegative = 0,
            countZero = 0;

        char choice;
	
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if(number > 0)
            {
                countPositive++;
            }
            else if(number < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }  
}