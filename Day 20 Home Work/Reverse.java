import java.util.Scanner;
class ArrayReverse
{
    int[] arr = new int[10];
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        ArrayReverse ar = new ArrayReverse();
        ar.mainMenu();
        System.out.println("Program Ended");
    }
    void mainMenu()
    {
        int option = 0;
        do
        {
            System.out.println("\n******** MAIN MENU ********");
            System.out.println("1. Enter Numbers");
            System.out.println("2. Display Numbers");
            System.out.println("3. Display Numbers in Reverse Order");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");

            option = sc.nextInt();

            switch(option)
            {
                case 1:
                {
                    enterNumbers();
                    break;
                }
                case 2:
                {
                    displayNumbers();
                    break;
                }
                case 3:
                {
                    displayReverse();
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting...");
                    break;
                }
                default:
                {
                    System.out.println("Please enter a valid option!");
                }
            }

        } while(option != 4);
    }

    void enterNumbers()
    {
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++)
        {
			System.out.println("Enter the " + i + " value : ");
            arr[i] = sc.nextInt();
        }
    }

    void displayNumbers()
    {
        System.out.println("Array Elements:");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void displayReverse()
    {
        System.out.println("Array in Reverse Order:");
        for(int i = 9; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
