import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rev=0;
		while(num!=0)
		{
		rev=rev*10+num%10;
		num=num/10;
		}
		
	
    System.out.println(rev);// your code goes here
	}
}