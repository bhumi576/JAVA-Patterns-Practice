import java.util.Scanner;

public class multiArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // ............... FIXED SIZE 2D ARRAY INPUT & OUTPUT .........................
        // int [][] arr1=new int[3][4];

        // taking input

        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr1[i].length;j++){
        //         arr1[i][j]=sc.nextInt();
        //     }
        // }

        //printing matrix / 2D array

        //  for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr1[i].length;j++){
        //         System.out.print(arr1[i][j]+ " ");
        //     }
        //     System.out.println(" ");
        // }


        //.................... USER DEFINED ROWS AND COLUMNS ......................
        //  - Matrix size decided at runtime
        //  - More flexible approach

        // System.out.println("enter no of rows: ");
        // int rows=sc.nextInt();

        // System.out.println("enter no of cols: ");
        // int cols=sc.nextInt();

        // int[][] arr=new int[rows][cols];

        //INPUT 

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }

        // PRINTING ARRAY

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println(" ");
        // }







        // ............... SUM OF TWO MATRIX ....................
        // sum is only possible in square matrix
        
        // int[][] arr1={
        //     {1,2,3},
        //     {5,6,7}
        // };

        // int [][]arr2={
        //     {3,6,7},
        //     {1,4,2}
        // };

        // int rows=arr1.length;
        // int cols=arr1[0].length;

        // int [][]arr3=new int[rows][cols]; // declaring the rows and cols 
        // // rows and cols of arr1, arr2 and arr3 will be same 

        // for(int i=0;i<arr3.length;i++){
        //     for(int j=0;j<arr3[i].length;j++){
        //         arr3[i][j]=arr1[i][j]+arr2[i][j];
        //     }
        // }

        // for(int i=0;i<arr3.length;i++){
        //     for(int j=0;j<arr3[i].length;j++){
        //         System.out.print(arr3[i][j] + " ");
        //     }
        //     System.out.println();
        // }
// OUTPUT-->
// 4 8 10 
// 6 10 9  
        





// ............... SUBTRACT TWO MATRIX .............
      
// int[][] arr1={
//             {1,2,3},
//             {5,6,7}
//         };

//         int [][]arr2={
//             {3,6,7},
//             {1,4,2}
//         };

// int rows=arr1.length;
// int cols=arr1[0].length;


// int[][] arr3=new int [rows][cols];
// for(int i=0;i<arr3.length;i++){
//     for(int j=0;j<arr3[i].length;j++){
//         arr3[i][j]=arr1[i][j]-arr2[i][j];
//     }
// }
// for(int i=0;i<arr3.length;i++){
//     for(int j=0;j<arr3.length;j++){
//         System.out.print(arr3[i][j]+ " ");
//     }
    // System.out.println();


// OUTPUT---> 
// -2 -4 
// 4 2
// }



// .............. MULTIPLY 2 MATRIX ..............

// int[][] arr1={
//             {1,2,3},
//             {5,6,7}
//         };

//         int [][]arr2={
//             {3,6,7},
//             {1,4,2}
//         };

// int rows=arr1.length;
// int cols=arr1[0].length;


// int[][] arr3=new int [rows][cols];
// for(int i=0;i<arr3.length;i++){
//     for(int j=0;j<arr3[i].length;j++){
//         arr3[i][j]=arr1[i][j]*arr2[i][j];
//     }
// }
// for(int i=0;i<arr3.length;i++){
//     for(int j=0;j<arr3.length;j++){
//         System.out.print(arr3[i][j]+ " ");
//     }
//     System.out.println();
// }

// OUTPUT-------->
// 3 12 
// 5 24







// ................. sum of each row ..............
// int[][] arr1={
//             {1,2,3},
//             {5,6,7}
//         };
//         // int sum=0;  
// for(int i=0;i<arr1.length;i++){
//     int sum=0;
//     for(int j=0;j<arr1[i].length;j++){
//         sum+=arr1[i][j];
//     }
//     System.out.println(sum);
// }

// OUTPUT--->>
// 6
// 18






// ........... SUM OF EACH COLUMN ...................
//         int[][] arr1={
//             {1,2,3},
//             {5,6,7}
//         };
// for(int i=0;i<arr1[0].length;i++){
//     int sum=0;
//     for(int j=0;j<arr1.length;j++){
//         sum+=arr1[j][i];
       
//     }
//     System.out.println(sum);
// }
// OUTPUT-->>
// 6
// 8
// 10
 




// ..................... count even and odd in a matrix .......................
// System.out.print("enter number of rows: ");
// int rows=sc.nextInt();

// System.out.print("enter number of cols: ");
// int cols=sc.nextInt();
// int evenCount=0;
// int oddCount=0;
// int [][]arr=new int [rows][cols];
// for(int i=0;i<arr.length;i++){
//     for(int j=0;j<arr[i].length;j++){
//         arr[i][j] =sc.nextInt();
//     }
// }

// for(int i=0;i<arr.length;i++){
//     for(int j=0;j<arr[i].length;j++){
//         if(arr[i][j]%2==0){
//             evenCount++;
//         }
//         else{
//             oddCount++;
//         }
//     }
// }

// System.out.println("even count = " + evenCount);
// System.out.println("odd count = " + oddCount);

// OUTPUT---> 
// 2 3 5 
// 4 5 6
// 4 5 6
// 34 1 1
// even count = 6
// odd count = 6



// ....... TRANSPOSE OF A MATRIX ........


// ...... REVERSE EACH ROW OF MATRIX ..............

// int[][] arr={
//             {1,2,3},
//             {5,6,7}
//         };
//         int rows=arr.length;
//         int cols=arr[0].length;
// int [][]arrT=new int [cols][rows];
// for(int i=0;i<arr.length;i++){
//     for(int j=0;j<arr[i].length;j++){
//         arrT[j][i]=arr[i][j];
//     }
// }

// for(int i=0;i<arrT.length;i++){
//     for(int j=0;j<arrT[i].length;j++){
//         System.out.print(arrT[i][j]+ " ");
//     }
//     System.out.println();
// }


// output-->
// 1 5 
// 2 6
// 3 7





}

}
