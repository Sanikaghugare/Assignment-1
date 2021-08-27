/*Write a program in JAVA to find the area of any triangle using Heron's Formula.   
Sample Output:
Find the area of any triangle using Heron's Formula :
----------------------------------------------------------
Input the length of 1st side of the triangle : 6
Input the length of 2nd side of the triangle : 6
Input the length of 3rd side of the triangle : 6
The area of the triangle is : 15.5884572681
 */
 
import java.util.Scanner;
class AreaOfTriangle
{
   public static void main(String args[]) 
    {   
       System.out.println("Find the area of any triangle using Heron's Formula :");
       System.out.println("---------------------------------------------------------");
      Scanner s1= new Scanner(System.in);    
      System.out.print("Input the length of 1st side of the triangle :");
      int a= s1.nextInt();
      System.out.print("Input the length of 2nd side of the triangle :");
       int b= s1.nextInt();
       System.out.print("Input the length of 3rd side of the triangle :");
       int c= s1.nextInt();
       int s=(a+b+c)/2;
       double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println("The Area of the triangle is: " + area);    
   }
}