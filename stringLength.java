//Java Program to Find the Length of a String
import java.util.*; 
class stringLength
{
 public static void main(String args[])
 {
 int i=0;
 String str;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string");
 str=sc.nextLine(); 
 int n=str.length();
        	System.out.println("Length of the string(using length() method) = "+n); 
 }
}