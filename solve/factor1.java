import java.util.*;

class factor1
{
public static void main(String[] args)
{
int number;
Scanner ob = new Scanner(System.in);
number= ob.nextInt();
for(int i=1;i<=number;i++){
if(number%i==0){
System.out.println("The factor is"+i);
}
}
}
}