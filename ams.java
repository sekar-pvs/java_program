import java.util.*;
class ams
{
public static void main(String args[])
{
Scanner aa=new Scanner(System.in);
System.out.print("enter the number");
int a=aa.nextInt();
int su=0;
int rem,cube;
int b=a;
while(b!=0)
{
rem=b%10; //here we give 152 the remainder is 3

cube=rem*rem*rem; // then cube is calculated 

su=su+cube;//sum is added to cube value 

b=b/10; //in 153 id we delete last number we use divide to 10 ,is used to delete the last value

}
if(su==a)
System.out.println("is a amstrong number");
else
System.out.println("is a NOTamstrong number");
}
}
 /*       LOGIC 


sum=0
condition(value!=0)
rem=n%10
cube=rem*rem*rem
value=value/10
sum=sum+cube*/





