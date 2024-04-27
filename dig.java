import java .util.*;
class dig 
{
public static void main(String args[])
{
digits();
//vaues();
}
static void digits(){
Scanner obb=new Scanner(System.in);
System.out.println("Enter the number");

int n=obb.nextInt();
int r;
int digit=0;
while(n!=0)
{
//r=n/10;
digit++;
n=n/10;

}

System.out.println("the numbe of digits is\t"+digit);
}
/*static void vaues(){
int digit;
Scanner obb=new Scanner(System.in);
System.out.println("Enter the same number");

int n=obb.nextInt();
int rem,cube =1;
for(int i=1;i<=digits;i++)
{
rem=n%10;
cube= cube*rem;

}
System.out.println(cube);
}*/


}