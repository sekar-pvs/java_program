import java.util.*;
class factor
{
public static void main(String[] args)
{
 int n,i=1;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number  : ");
n=scan.nextInt();

System.out.println("The factor of "+n+ " is");
while(i<=n){
if (n%i==0)
{
System.out.println(i);
}
i++;
}

}
}
