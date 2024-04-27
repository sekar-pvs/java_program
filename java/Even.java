import java.util.Scanner;
public class Even
{
public static void main(String[] arg)
{
//int a=10;
Scanner b= new Scanner(System.in);
System.out.print("enter the value of a: ");
int a=b.nextInt();

if( a % 2 == 0)
{
System.out.println("The number is even ");
}
else
{
System.out.println("the given number is ODD");
}
}
}