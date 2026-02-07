// import java.util.*;
// public class arrays_ques {
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in); 

// .....................LEVEL 1: BASIC ARRAY OPERATIONS....................

// int []arr={10,20,30,40,};
// 1.Print Array in Reverse Order

// for (int i = arr.length - 1; i >= 0; i--) {
//     System.out.print(arr[i] + " ");   // 40 30 20 10 
// }




// 2. Find Sum of Array Elements

// int sum = 0;
// for (int i = 0; i < arr.length; i++) {
//     sum += arr[i];
// }
// System.out.println("Sum = " + sum); //Sum = 100





// 3. Find Average of Array Elements

// int sum = 0;
// for (int i = 0; i < arr.length; i++) {
//     sum += arr[i];
// }
// double avg = (double) sum / arr.length;
// System.out.println("Average = " + avg);  //Average = 25.0






// 4. Count Even and Odd Numbers

// int even = 0;
// int odd = 0;
// for (int i = 0; i < arr.length; i++) {
//     if (arr[i] % 2 == 0)
//         even++;
//     else
//         odd++;
// }
// System.out.println("Even count = " + even);  //Even count = 4
// System.out.println("Odd count = " + odd);   //Odd count = 0





// 5. Find Maximum Element

// int max = arr[0];
// for (int i = 1; i < arr.length; i++) {
//     if (arr[i] > max)
//         max = arr[i];
// }
// System.out.println("Maximum = " + max);  //Maximum = 40






// 6. Find Minimum Element

// int min = arr[0];
// for (int i = 1; i < arr.length; i++) {
//     if (arr[i] < min)
//         min = arr[i];
// }
// System.out.println("Minimum = " + min);  //Minimum = 10





//7. Search an Element (Linear Search)

// int key = 5;
// boolean found = false;
// for (int i = 0; i < arr.length; i++) {
//     if (arr[i] == key) {
//         found = true;
//         break;
//     }
// }
// if (found)
//     System.out.println("Element found");
// else
//     System.out.println("Element not found");
// output----->>> Element not found






// .......... LEVEL 2: INDEX & POSITION BASED PROBLEMS........
// int [] arr={4,56,2,3,4,3,10};


// 1. Print Elements at Odd Index

// for (int i = 0; i < arr.length; i++) {
//     if (i % 2 != 0)
//         System.out.print(arr[i] + " ");  //56 3 3 
// }




// 2. Count Occurrences of an Element
// int key = 3;
// int count = 0;
// for (int i = 0; i < arr.length; i++) {
//     if (arr[i] == key)
//         count++;
// }
// System.out.println("Occurrences = " + count);  //Occurrences = 2


// }
// }
