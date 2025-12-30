import java.util.Scanner;
class Multiples
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int a = sc.nextInt();
		if(a%3==0 && a%7==0)
		{
			System.out.println(a +" is a mulitples of 3 & 7");
		}
		else if(a%3==0)
		{
			System.out.println(a +" is a mulitples of 3");
		}
		else if(a%7==0)
		{
			System.out.println(a +" is a mulitples of 7");
		}
		else
		{
			System.out.println(a +" is not a mulitples of 3 and 7");
		}
	}
}
		