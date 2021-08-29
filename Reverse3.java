/*Write a language program in JAVA which accepts the user's first and last name and print them in reverse order with a space between them.   
Sample Output:
Print the name in reverse where last name comes first:
-----------------------------------------------------------
Input First Name: Alexandra
Input Last Name: Abramov
Name in reverse is: Abramov Alexandra
*/
import java.util.Scanner;
class Reverse3{
public static void main (String args[]) {
Scanner sc = new Scanner (System.in);
System.out.println("Print the name in reverse where last name comes first:");
System.out.println("-----------------------------");
System.out.println("Input First Name:");
String fname = sc.next();
System.out.println("Input LastvName:");
String lname = sc.next();
System.out.println("Name in reverse is :" + lname +" " + fname);
}
}