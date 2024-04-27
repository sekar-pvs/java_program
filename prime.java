import java.util.*;
class prime 
{
public static void main(String[] args)
{
 int n,i;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number  : ");
n=scan.nextInt();
for(i=2;i<=n && i%n==0 || i%n==1;i++)
{


System.out.println(i);

}/*
System.out.println("The factor of "+n+ " is");
while(i<=n){
if (n%i==0)
{
System.out.println(i);
}
i++;
}*/

}
}
