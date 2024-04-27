/* PALINDEOME

import java.util.*;
class palindrome{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int num = sc.nextInt();
int res=0,rem;
int n=num;
while(n!=0){
	rem=n%10;
	res = (res*10)+rem;
	n= n/10;	
            }
	System.out.println("the op is "+res);

if(num==res){
System.out.println("the given number is palindrome");
}
else{
System.out.println("not");
}
}
}

*/

// prime 
import java.util.*;
class palindrome 
{
public static void main(String[] args)
{
 int n,i;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number  : ");
n=scan.nextInt();
for(i=2;i<n && n%i!=0 ;i++)//i%n==0 || i%n==1
{
boolean ii = parseBollean(i);
if(ii!=true){
System.out.println("not prime"+n);
}
else{
System.out.println("prime"+n);
}

}
}
}