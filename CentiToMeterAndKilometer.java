/*Write a program in JAVA to enter length in centimeter and convert it into meter and kilometer.   
Sample Output:
Convert centimeter into meter and kilometer :
--------------------------------------------------
Input the distance in centimeter : 250000
The distance in meter is: 2500
The distance in kilometer is: 2.5
 */
 
 import java.util.Scanner;
class CentiToMeterAndKilometer
{
public static void main(String args[])
{
    System.out.println("Convert centimeter into meter and kilometer:");
    System.out.println("--------------------------------------------");
    double cm, meter, km;
    Scanner op=new Scanner(System.in);
    System.out.print("Input the distance in centimeter: ");
    cm=op.nextDouble();
    meter = cm / 100.0;
    km    = cm / 100000.0;
    System.out.println("The distance in meter = "+ meter+" m ");
    System.out.println("The distance in kilometer ="+km+" km");
    }
}