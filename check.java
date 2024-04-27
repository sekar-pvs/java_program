import java.util.*;
class check
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
if(N>=2 && N<=5)
{
   if(N%2==0)
   System.out.println("2-5Even");
   else
   System.out.println("2-5 odd");
}

else if(N>=6 && N<=20)
{
    if(N%2==0)
   System.out.println("6-20Even");
   else
   System.out.println("6-20 odd");
}

else if(N>20)
{
   if(N%2==0)
   System.out.println(">20Even");
   else
   System.out.println(">20 odd");
}

else 
{

} 
 }

 }