import java.util.Scanner;
class Week
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int a = sc.nextInt();
		switch(a)
		{
			case 1:
			{
				System.out.print("MONDAY");
				break;
			}
			case 2:
			{
				System.out.print("TUESDAY");
				break;
			}
			case 3:
			{
				System.out.print("WEDNESDAY");
				break;			
			}
			case 4:
			{
				System.out.print("THURSDAY");
				break;
			}
			case 5:
			{
				System.out.print("FRIDAY");
				break;
			}
			case 6:
			{
				System.out.print("SATURDAY");
				break;
			}
			case 7:
			{
				System.out.print("SUNDAY");
				break;
			}
		}
	}
}