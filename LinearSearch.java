//Linear Search is a sequential search algorithm.
//
//    1.In Linear Search, we’ll have to traverse the array comparing the elements consecutively one after the other
//    2.Until the target value is found.
//    3.Linear Search has a high time complexity making at most n comparison
//    4.Hence, it is only suitable to search for elements in a small and unsorted list of elements

//     Time Complexity:O(n)
//     Best Case:O(1)
//     Worst Case:O(n)
//     Space Complexity: O(1)
//     Avg. Comparisons: (n+1)/2

public class LinearSearch {

    private static void LinearSearch1(int[] arr, int item) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println(item + " Found at index: " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }

    //Driver Code
    public static void main(String args[]){
        int[] arr = {12, 5, 18, 25, -3, 19};

        int item = 25;
        LinearSearch1(arr, item);
    }
}
