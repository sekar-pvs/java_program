import java.util.*;
class prime
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
//int i =scan.nextInt();
int i=2 ,flag=0;
if(n==0 || n==1)
{
flag=1;
}
/*for(i=2;i<=n-1;i++)
{
if(n%i==0)
{
flag=1;
break;
}
} BOTH FOR AND WHILE ARE DONE SAME WORK*/

while(i<=(n-1))
{
if (n%i==0)
flag=1;
break;
}

if (flag==0)
System.out.println("prime");
else
System.out.println("not prime");
}
}