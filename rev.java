import java.util.*;

class rev{
public static void main(String[] args){
Scanner sc= new Scanner (System.in);
String str= sc.nextLine();
String rev ="";
char ch;
for(int i=0;i<str.length();i++)
{
ch = str.charAt(i);
rev = ch+rev;
}
System.out.println(rev);
}
}