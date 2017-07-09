import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
		public static void main (String[] args) throws java.lang.Exception
	{
	
	int n1,n2;
	int fact=0;
	Scanner s=new Scanner(System.in);
	n1=s.nextInt();
	n2=s.nextInt();
	int i;
System.out.println("enter two numbers with greater number first");
for(i=n2;i>=n1;i--)
{
	if((n2%i)==0)
	{fact ++;
System.out.println("factors are:"+fact);}	
		
}
}}
