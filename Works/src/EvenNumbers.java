import java.util.Scanner;
public class EvenNumbers
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number whenever you desired to print: ");
		int n = scan.nextInt();
		
		for ( int i = 1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.println(+i);
			}
		}
	}
}
