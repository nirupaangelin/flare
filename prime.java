import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
		public static void main (String[] args) throws java.lang.Exception
	{
	int n;
	int fact=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int i;
for(i=n;i>0;i--)
{
	if((n%i)==0)
	fact ++;
	
		
}
if(fact>2)

	System.out.println("not a prime");
	else
	System.out.println("prime");

}


}	