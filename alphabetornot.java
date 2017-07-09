import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	char c;
Scanner s=new Scanner(System.in);
c=s.next().charAt(0);
if(Character.isLetter(c))
System.out.println("alphabet");
else
System.out.println("not an alphabet");
	}
}