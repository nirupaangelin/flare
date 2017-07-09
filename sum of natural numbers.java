import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		int a;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=n*(n+1)/2;
		System.out.println("The sum of 'n' natural numbers is:"+a);
	}
}