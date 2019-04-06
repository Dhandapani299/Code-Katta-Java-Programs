import java.io.*;
import java.util.*;
public class SumNum{
public static void main(String args[])
{



Scanner s = new Scanner(System.in);
int i,n;
int total = 0;
System.out.println("enter the value" ) ;
n= s.nextInt();


for(i=0;i<=n;i++)
{


total = total +i;

}
System.out.println(total+ " total values");

}
} 