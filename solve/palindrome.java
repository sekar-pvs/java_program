import java .util.*;

class palindrome{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int rem,res=0;
int c=n;
while(c!=0){
rem= c%10;
res = (res*10)+rem;
c=c/10;
}
System.out.println(res);
System.out.println(n);
if(n==res){
System.out.println("is a palindrome");
}
else{
System.out.println("not a palindrome");
}
}
}