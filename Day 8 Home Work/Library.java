class Library 
{
    public static void main(String[] args) 
	{
        int totalBooks = 1800;
        int maths = totalBooks * 40 / 100;
        int english = totalBooks * 20 / 100;
        int science = totalBooks * 30 / 100;
        int social = totalBooks * 10 / 100;
        System.out.println("Maths books: " + maths);
        System.out.println("English books: " + english);
        System.out.println("Science books: " + science);
        System.out.println("Social books: " + social);
    }
}
