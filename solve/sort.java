import java.util.*;
class sort{
public static void main(String [] args){
int a[]={2,5,6,3,8,4};
// before sorting

System.out.println("BEFORE SORT");
for(int i=0 ; i<a.length;i++){
System.out.println(a[i]);
}

System.out.println("AFTER SORT");
for (int i =0;i<a.length;i++){
for(int j =i+1;j<a.length;j++){
int temp=0;
if(a[j]<a[i]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
System.out.println(a[i]);
}
}
}