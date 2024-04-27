import java.util.*;
class seqprime
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
 int i,flag=0,a=1;
System.out.println("PRIME NUMBER");
while(a<=n){
for(i=2;i<n;i++)
{
if(n%i==0)
{
 System.out.println(i);
// break;
}
a++;
}
}
}
}