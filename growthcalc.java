/* PROJECT 1: Youtube Growth Calculator */
//Name: Mr. M Chandan Agrahar 
//Date: 16-Jul-2020

package intern;
import java.util.Scanner;
public class growthcalc 
{
	public static void main(String [] args)
	{
		System.out.println("****Welcome to Youtube subscriber count calculator****");
		System.out.println("Provide the no. of subscribers you have at present(a): ");//a=variable used for growth
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the growth rate(r): ");//r=variable used for growth rate
		double r = sc.nextDouble();
		System.out.println("Time Interval in days(x): ");//x=variable used for time interval
		int x = sc.nextInt();
		System.out.println("subscriber count would be:");
		System.out.println(SubGrowth(a,r,x));
		sc.close();
	}
	
	public static int SubGrowth(int a, double r, int x)
	{
		return (int)(a*Math.pow((1+r),x));
	}
}
