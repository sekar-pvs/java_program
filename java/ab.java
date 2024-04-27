import java.util.Scanner;
class ab
{
public static void main(String[] args)
{
int b[][]=new int[10][10];
Scanner a=new Scanner(System.in);
System.out.println("enter yhe value");
int n=a.nextInt();
System.out.println("get the array vslue in run time");
for(int i=0;i<=n;i++)

for(int j=0;j<=n;j++)

b[i][j]=a.nextInt();

System.out.println("array");
for(int i=0;i<=n;i++)
{
for(int j=0;j<=n;j++)
{
System.out.println(b[i][j]+"\t");
System.out.print();
}
}

}
}