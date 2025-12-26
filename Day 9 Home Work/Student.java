class Student
{
	public static void main(String[] args)
	{
		int marks = 50;
		if(marks>=90 && marks<=100)
		{
			System.out.println(" A grade ");
		}
		else if(marks>=70 && marks<90)
		{
			System.out.println(" B grade ");
		}
		else if(marks>=50 && marks<70)
		{
			System.out.println(" C grade ");
		}
		else if(marks>=25 && marks<50)
		{
			System.out.println(" D grade ");
		}
		else
		{
			System.out.println(" Fail ");
		}
	}
}
			