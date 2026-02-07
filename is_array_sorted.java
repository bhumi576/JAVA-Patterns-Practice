import java.util.*;
public class github_ques {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
// CHECKING IF ARRAY IS SORTED IN ASCENDING ORER OT NOT?

        int[] arr1={1,2,3,6,4,5};
        boolean isSorted = true;  //assuming array is sorted

        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                isSorted = false;  // if max value is present before the value, i.e., min to it-->> array is unsorted
                break;   // exit the loop
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is NOT sorted in ascending order");
        }
// OUTPUT---> 
// Array is NOT sorted in ascending order
      

         // taking user input 

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted2 = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted2 = false;
                break;
            }
        }

        if (isSorted2) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is NOT sorted in ascending order");
        }

// OUTPUT--->
// Enter array size: 3
// Enter array elements:
// 1 4 5
// Array is sorted in ascending order

  
    }
}
