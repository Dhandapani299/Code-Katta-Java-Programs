import java.io.*;
import java.util.*;
public class Positive 
{
public static void main(String args[])
{

int num;
System.out.println("Enter the number");
Scanner s = new Scanner(System.in);
num =s.nextInt();
if(num>0)
{

System.out.println("positive");

}
else if(num<0){
System.out.println("negative");
}
else{
System.out.println("zero");
}
}
}