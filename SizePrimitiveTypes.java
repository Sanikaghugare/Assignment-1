/*Write a program in JAVA to find Size of fundamental data types.   
Sample Output:
Find Size of fundamental data types :
------------------------------------------
The sizeof(char) is : 1 bytes
The sizeof(short) is : 2 bytes
The sizeof(int) is : 4 bytes
The sizeof(long) is : 8 bytes
The sizeof(long long) is : 8 bytes
The sizeof(float) is : 4 bytes
The sizeof(double) is : 8 bytes
The sizeof(bool) is : 1 bytes
 */
 
 class SizePrimitiveTypes
{
  public static void main (String[] args)
  {
    System.out.println("Find Size of fundamental data types :");
      System.out.println("-------------------------------------");
    System.out.println("The sizeof(char)is : " + (Byte.SIZE/8) + " bytes.");
    System.out.println("The sizeof(short)is : " + (Short.SIZE/8) + " bytes.");
    System.out.println("The sizeof(int)is : " + (Integer.SIZE/8) + " bytes.");
    System.out.println("The sizeof(long)is : " + (Long.SIZE/8) + " bytes.");
    System.out.println("The sizeof(long long)is :" + (Long .SIZE/8) + " bytes.");
    System.out.println("The sizeof(float)is : " + (Float.SIZE/8) + " bytes.");
    System.out.println("The sizeof(double)is :" + (Double.SIZE/8) + " bytes.");
        System.out.println("The sizeof(bool)is:" +(Byte.SIZE/8)+" bytes.");
  }
}