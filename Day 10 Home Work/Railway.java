import java.util.Scanner;
class Railway
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int a = sc.nextInt();
		switch (a) 
		{
            case 1:
                System.out.println("General");
                break;
            case 2:
                System.out.println("Sleeper");
                break;
            case 3:
                System.out.println("AC 3 Tier");
                break;
            case 4:
                System.out.println("AC 2 Tier");
                break;
            case 5:
                System.out.println("First Class");
                break;
            default:
                System.out.println("Invalid seat type");
        }
	}
}