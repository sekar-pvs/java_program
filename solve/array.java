import java.util.*;

class array{
public static void main (String [] args)
{

Scanner sc= new Scanner(System.in);
int k=sc.nextInt();
int [][] a= new int[k][k];
for(int i=0;i<k;i++){

for(int j=0;j<k;j++){
a[i][j] = sc.nextInt();
}
}
for(int i=0;i<k;i++){
for(int j=0;j<k;j++){
System.out.println(a[i][j]);
}
}
}
}