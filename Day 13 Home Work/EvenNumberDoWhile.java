class EvenNumberDoWhile
{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{
			if(i%2==0)
			{
				System.out.println(i + " is an Even Number");
			}
			i++;
		}while(i<=30);
	}
}