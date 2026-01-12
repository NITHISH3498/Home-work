import java.util.Scanner;

class ArrayCount
{
    int[] arr = new int[10];
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayCount ac = new ArrayCount();
        ac.mainMenu();
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
            System.out.println("3. Count Positive Numbers");
            System.out.println("4. Count Negative Numbers");
            System.out.println("5. Count Zeros");
            System.out.println("6. Exit");
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
                    countPositive();
                    break;
                }
                case 4:
                {
                    countNegative();
                    break;
                }
                case 5:
                {
                    countZero();
                    break;
                }
                case 6:
                {
                    System.out.println("Exiting...");
                    break;
                }
                default:
                {
                    System.out.println("Please enter a valid option!");
                }
            }

        } while(option != 6);
    }

    void enterNumbers()
    {
        System.out.println("Enter 10 integers:");
        for(int i = 0; i < 10; i++)
        {
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

    void countPositive()
    {
        int count = 0;
        for(int i = 0; i < 10; i++)
        {
            if(arr[i] > 0)
            {
                count++;
            }
        }
        System.out.println("Positive Numbers Count: " + count);
    }

    void countNegative()
    {
        int count = 0;
        for(int i = 0; i < 10; i++)
        {
            if(arr[i] < 0)
            {
                count++;
            }
        }
        System.out.println("Negative Numbers Count: " + count);
    }

    void countZero()
    {
        int count = 0;
        for(int i = 0; i < 10; i++)
        {
            if(arr[i] == 0)
            {
                count++;
            }
        }
        System.out.println("Zero Count: " + count);
    }
}
