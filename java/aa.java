import java.util.Scanner;
public class aa
{
public static void main(String[] args)
{
Scanner a=new Scanner(System.in);
System.out.println("Enter the A value");
int n=a.nextInt();
//System.out.println("Enter the value of C");
//int c=a.nextInt();
for(int i=n;i>=1;i--){
for(int j=n;j>=i;j--)
{
System.out.print("* ");
}
System.out.println(" ");
}
}
}