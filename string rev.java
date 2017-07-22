import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String string=s.next();
	 String result="";
    for (int i=string.length()-1; i>=0; i--) {
        result = result + string.charAt(i);
    }
    System.out.println(result.toString());// your code goes here
	}
}