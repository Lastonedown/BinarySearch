import java.util.*;
//Binary Search Algorithm class
public class BinarySearch {
    int binarySearch(int array[], int x)
    {

        int a = 0, r = array.length;
        while (a <= r) {
            int middle = a + (r - a) / 2;

            // Check if x is present at middle of array
            if (array[middle] == x)
                return middle;
            // If x greater than the middle number ignore left half of array
            if (array[middle] < x)
                a = middle + 1;
            // If x is smaller than the middle ignore right half of array
            if (array[middle] >  x )
                r = middle - 1;
                // If iteration exceeds the array size to search for number not in array a value of 0 will be returned
            else if (r<a)
                return 0;

        }

        // If x was not present a value of 0 will be returned
        return 0;


    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to search array: ");
        int userInput = input.nextInt();
        BinarySearch object = new BinarySearch();
        int arr[] = {5,10,15,20,25,30,35,40,45,50,55,60,65,70};
        int result = object.binarySearch(arr, userInput) ;
        if (result == 0)
            System.out.printf( "%s Was not found", userInput);
        else
            System.out.printf( "%s Was found in index %s", userInput, result);

        input.close();

    }
}
