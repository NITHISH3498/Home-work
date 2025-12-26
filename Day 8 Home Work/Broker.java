class Broker 
{
    public static void main(String[] args) 
	{
        int amount = 750;
        int rate = 15;
        double commission = amount * rate / 100;
        System.out.println("Commission = Rs. " + commission);
    }
}
