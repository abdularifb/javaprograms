import java.util.Scanner;
public class Primenumber
{
   public static void main(String args[])
   {
	int count=0,i,num;
        Scanner in=new Scanner(System.in);
	System.out.print("\nenter a number");
	num=in.nextInt();
	for(i=1;i<=num;i++)
	{
		if(num%i==0)
		{	
                     count++;
		}
	
        }
	if(count==2)
	System.out.print("\n it is prime number");
	else
	{
	    System.out.print("\n it is not prime number");
	}
   }
}