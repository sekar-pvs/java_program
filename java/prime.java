import java.util.Scanner;
class prime{
public static void main(String[] args)
{
Scanner a=new Scanner(System.in);
System.out.println("enter the number");
int number=a.nextInt();
if(isPrime(number))
{
System.out.println(number+"is a prime number");
}
else{
System.out.println(number+"is a not prime number");
}
}
static boolean isPrime(int num)
{
if(num<=1)
{
return false;
}
for(int i=2;i<=num/2;i++)
{
if((num%i)==0)
return false;
}
return true;
}
}