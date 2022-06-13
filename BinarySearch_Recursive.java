
//Binary search is a searching technique that is based upon the Divide-and-Conquer Rule.
//        In this searching technique, a sorted array is divided into two equal halves and then the same technique is
//                applied onto the two halves searching for the element by comparing the high and the low.

// Working of Binary Search
//1. For Binary Search to be performed on any array, the array must be already sorted in any format, that is, either ascending or descending.
//        Find the middle index of the array/list.
// 2. If the middle element is equal to the search element, Stop Searching.
// 3. If the element that is to be searched is less then the middle element then consider the first half as a separate list.
// 4. Else-If the element that is to be searched is larger then the middle element then consider the second half as a separate list.
// 5. Repeat Step 2-3-4-5 Until desired result is found.


// Binary Search implementation in Java (Recursive)
// Time Complexity : O(N)
// Space Complexity : O(1)
// Auxiliary Space Complexity : O(N) due to function call stack
public class BinarySearch_Recursive {

    public static int binarySearch(int array[], int left, int right, int item){
        if(right >= left){

            // calculation of new mid
            int mid = left + (right - left)/2;

            // returns position where found
            if (array[mid] == item)
                return mid+1;

            //goes to recursive calls in left half
            if (array[mid] > item)
                return binarySearch(array, left, mid-1, item);

            // goes to recursive calls in right half
            else
                return binarySearch(array, mid+1, right, item);
        }
        // if elements is not found we return -1
        else
            return -1;
    }
    public static void main(String args[]) {
        int[ ] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int item = 70;
        int size = array.length;

        int position = binarySearch(array, 0, size-1, item);

        if(position == -1)
            System.out.println("Element not found");
        else
            System.out.println("The value " + item + " found at position: " + position);
    }
}
