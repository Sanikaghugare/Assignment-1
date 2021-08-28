/*Write a program in JAVA that converts kilometers per hour to miles per hour.   
Sample Output:
Convert kilometers per hour to miles per hour :
----------------------------------------------------
Input the distance in kilometer : 5
The 5 Km./hr. means 3.10686 Miles/hr.
 */
 
 import java.util.Scanner;
public class Convert {
public static void main(String[] args) {		
System.out.println("Convert kilometers per hour to miles per hour :");
System.out.println("-------------------------------------------------");
	double kilometers;
	System.out.print("Input the distance in kilometer:");
		Scanner in = new Scanner(System.in);
		kilometers= in.nextDouble();
		double miles= kilometers / 1.6;
		System.out.print("The"+kilometers +"Km./hr.means"+ miles +"Miles/hr");
	}
}