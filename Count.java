import java.io.*;
import java.util.*;
public class Count{
public static void main(String args[])
{



Scanner s = new Scanner(System.in);
int i,n;
int count = 0;
System.out.println("enter the value" ) ;
n= s.nextInt();
while(n!=0)
{

n /=10;
++count;

}
System.out.println(count+ " number of digits");

}
} 