/*Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
*/

class Student_{
	
int roll_no;

long Phone_Number;

String Address;
 }

public class Main {

public static void main(String[] args) {

 Student student_object1 = new Student();

Student student_object2 = new Student();

student_object1.roll_no = 1;

student_object1.Phone_Number = 1234567667;

student_object1.Address = "Pune";

student_object2.roll_no = 2;

student_object2.Phone_Number = 1234566677;

student_object2.Address = "Mumbai";

System.out.println(student_object1.roll_no +" " + student_object1.Phone_Number +" " + student_object1.Address);

System.out.println(student_object2.roll_no + " " + student_object2.Phone_Number + " "+ student_object2.Address);
}
}