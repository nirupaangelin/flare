/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s =new Scanner(System.in);
	String n=s.next();
	String m=s.next();
	int x=Integer.parseInt(n);
	int y=Integer.parseInt(m);
	int result=x*y;
	System.out.println(Integer.toString(result));
	}
}