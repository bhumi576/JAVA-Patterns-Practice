import java.util.*;
public class github_ques {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       // when an array is given
        int [] arr={10,20,40,70};
        int target=40;
        boolean present=false;  //assuming element is not present

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print("Element found at index: " + i); 
                present=true;  //element found in the array
                break;   // once element found, break the loop i.e stop searching afterwards
            }
        }
         if(!present){
            System.out.println("Element is not present..");  // executes if element is not present
           }




        // taking user input
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();  // size of array
        int[] arr2=new int[n]; // declaring array of size n

        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();  // eneter n number of elements
        }

        System.out.print("Enter the number you want t search: ");
        int target2=sc.nextInt();
        boolean present1=false;
        for(int i=0;i<n;i++){
            if(arr2[i]==target2){
                System.out.println("Element "+ target2 + " found at index " + i);
                present1=true;
                break;
            }
        }
        if(!present1){
            System.out.println("Element is not present...");
        }

        //OUTPUT--->
// enter the size of array: 5
// 10 20 30 40 50
// Enter the number you want t search: 30
// Element 30 found at index 2
    }
}
