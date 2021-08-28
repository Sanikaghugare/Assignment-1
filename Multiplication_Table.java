/*Write a program in JAVA that takes a number as input and prints its multiplication table upto 10.   
Sample Output:
Print the multiplication table of a number upto 10:
--------------------------------------------------------
Input a number: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
 */
 
 import java.util.Scanner;
public class Multiplication_Table 
{
    public static void main(String[] args) 
    {
       System.out.println("Print the multiplication table of a number upto 10 :");
       System.out.println("--------------------------------------");
       Scanner s = new Scanner(System.in);
	   System.out.print("Input a number:");        
	    int n=s.nextInt();
         for(int i=1; i <= 10; i++)
        {
         System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}