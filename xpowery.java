import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("x raised to the power y:"+Math.pow(x,y));
	}
}