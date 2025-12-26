class Person
{
    public static void main(String[] args) 
	{
        int P = 25000;
        double R = 7/100;
        double T = 4;
        double SI = (P * R * T) / 100;
        double totalAmount = P + SI;
        System.out.println("Total Balance after 4 years = Rs. " + totalAmount);
    }
}
