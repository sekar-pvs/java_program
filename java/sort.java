public class sort
{
public static void main(String[] args) 
{
int []a=new int[]{5,3,6,7,8};
int temp=0;
System.out.println("before sorting");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]+" ");
}
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}


System.out.println("AFTER SORTING");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]+" ");
}
}
}
