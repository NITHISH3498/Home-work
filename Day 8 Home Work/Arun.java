class Arun
{
    public static void main(String[] args) 
	{
        int P = 50000;
        double R = 6/100;
        int T = 5;
        double SI = (P * R * T) / 100;
        double totalAmount = P + SI;
        System.out.println("Simple Interest = Rs. " + SI);
        System.out.println("Total Balance after 5 years = Rs. " + totalAmount);
    }
}
