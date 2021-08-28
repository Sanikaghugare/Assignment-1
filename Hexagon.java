/*Write a program in JAVA to print the area of a hexagon.   
Sample Output:
Print the area of a hexagon:
---------------------------------
Input the side of the hexagon: 6
The area of the hexagon is: 93.5307
 */
 
import java.util.Scanner;
public class Hexagon 
{
	public static void main(String[] args) 
	{
		System.out.println("Print the area of hexagon:");
		System.out.println("----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the side of the hexagon : ");
		double s = sc.nextDouble();
		System.out.print("The area of the hexagon is : " + hexagonArea(s)+"\n");
	}
	public static double hexagonArea(double s)
	{
	    return (6*(s*s))/(4*Math.tan(Math.PI/6));
	}
}