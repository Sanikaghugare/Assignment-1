/*Write a program in JAVA to find the third angle of a triangle.   
Sample Output:
Find the third angle of a triangle :
-----------------------------------------
Input the 1st angle of the triangle : 30
Input the 2nd angle of the triangle : 60
The 3rd of the triangle is : 90
 */

 import java.util.Scanner;
class Triangle
{
public static void main(String args[])
{
    System.out.println("Find the third angle of a triangle");
    System.out.println("----------------------------------------");
    int a, b, c;
    Scanner op=new Scanner(System.in);  
    System.out.print("Input the 1st angle of the triangle: ");
    a=op.nextInt();
    System.out.print("Input the 2nd angle of the triangle: ");
    b=op.nextInt();
    c = 180 - (a + b);
    System.out.println("The 3rd of the triangle is : "+c);
}
}