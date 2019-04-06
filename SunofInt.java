import java.io.*;
import java.util.*;
public class SunofInt{
public static void main(String args[])
{



Scanner s = new Scanner(System.in);
int k,n,i;
int sum= 0;
System.out.println("enter the value" ) ;
n= s.nextInt();
k= s.nextInt();
int a[] = new int[n];
for(i=0;i<a.length;i++){

a[i]=s.nextInt();
}

for(i=0;i<k;i++)
{sum=sum+a[i];}
System.out.println(sum);

}
}  