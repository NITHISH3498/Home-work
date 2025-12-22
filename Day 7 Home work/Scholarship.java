class Scholarship
{
	public static void main(String[] args)
	{
		int marks = 85;
		boolean attendance = true;
        boolean discipline = true;
        boolean result = (marks >= 80) && (attendance || discipline);
        System.out.println("PASS & ELIGIBLE FOR SCHOLARSHIP: "+result);
    }
}