public class toh{
public static void main(String[] args)
{
int nDisk=3;
doTower(nDisk,'a','b','c');
}
public static void doTower(int topN, char from, char inter, char to)
{
if(topN==1)
{
System.out.println("disk 1 from"+from+ "to" +to);
}
else{
doTower(topN-1,from,to,inter);
System.out.println("disk"+topN+"from" +from+ "to" +to);
doTower(topN-1,inter,from,to);
}
}
}