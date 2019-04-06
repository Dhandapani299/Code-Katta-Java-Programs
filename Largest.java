import java.io.*;
import java.util.*;
public class Largest{
public static void main(String args[])
{
int x,y,z;

System.out.println("enter the three value");
Scanner s = new Scanner(System.in);
x= s.nextInt();
y=s.nextInt();
z=s.nextInt();

if(x>y && x>z) 
{System.out.println(x + "first number is largest");
}
else if(y>x && y>z)
{System.out.println(y + "second number is largest");

}
else if(z>x && z>y)
{System.out.println(z +  "third number is largest");}
else System.out.println("invalid");
}
}