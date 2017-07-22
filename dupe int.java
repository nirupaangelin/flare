
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner s=new Scanner(System.in);
String n=s.next();
for(int i=0;1<n.length()-1;i++)
{
	for(int j=i+1;j<=n.length()-1;j++)
	{
		if (n.charAt(i)==n.charAt(j))
		System.out.println("the duplicate is:"+n.charAt(i));
	}

}}
}