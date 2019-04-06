import java.io.*;
import java.util.*;
public class Vowels{
public static void main(String args[])
{
System.out.println("enter the value");
Scanner s = new Scanner(System.in);

char ch =s.next().charAt(0);
if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{System.out.println("vowels");
}
else {System.out.println("constant");}
}
}