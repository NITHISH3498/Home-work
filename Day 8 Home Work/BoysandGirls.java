class BoysandGirls
{
	public static void main(String[] args) 
	{
		int Students = 50;
        int girlsPercent = 40;
        int girls = Students * girlsPercent / 100;
        int boys = Students - girls;
        System.out.println("Number of girls: " + girls);
        System.out.println("Number of boys: " + boys);
    }
}