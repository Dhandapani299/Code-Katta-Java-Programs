import java.io.*;
import java.util.*;
public class LeapYear{
public static void main(String args[])
{


System.out.println("enter the year");
Scanner s = new Scanner(System.in);
int year= s.nextInt();
boolean flag = false;
if(year % 400 ==0)
{flag = true;}
else if(year % 100 == 0)
{flag = false;}
else if(year%4==0)
{flag = true;}
else{flag = false;}
if(flag){
System.out.println("year" +year+ "is a leap year");}
else{

System.out.println("year" +year+ "is a not leap year");}
}
}