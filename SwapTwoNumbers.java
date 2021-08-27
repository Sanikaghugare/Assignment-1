/*Write a program in JAVA which swap the values of two variables not using third variable.   
Sample Output:
Swap two numbers without using third variable:
---------------------------------------------------
Input 1st number : 25
Input 2nd number : 20
After swapping the 1st number is : 20
After swapping the 2nd number is : 25
 */
 
import java.util.*;
class SwapTwoNumbers
{
	public static void main(String []s)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Swap two numbers without using third variable :");
		System.out.println("-------------------------------------");
		System.out.print("Input 1st number: ");
		a=sc.nextInt();
		System.out.print("Input 2nd number:");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping the 1st number is :" + a);
		System.out.println("After swapping the 2nd number is :"+ b);
	}
}