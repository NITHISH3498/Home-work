class BinarySearch
{
    public static void main(String[] args)
    {
        int arr[] = {2, 5, 8, 12, 16, 23, 38};
        int SearchElement = 16;

        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right)
        {
            mid = (left + right) / 2;

            if (SearchElement == arr[mid])
            {
                System.out.println("Element found at index: " + mid);
                break;
            }
            else if (SearchElement > arr[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
    }
}