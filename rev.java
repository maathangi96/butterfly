import java.io.*;
import java.util.*;
class rev
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
if(s<=100000)
{
String rev=String.reverse(s);
System.out.println(rev);
}
}
}
