import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        
//   PATTERN 1: Diamond (Odd Stars)
//     *
//    ***
//   *****
//    ***
//     *
        

//upper
int n=5;
int mid=(n/2)+1;
for(int i=1;i<=mid;i++){
    for(int j=1;j<=mid-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=2*i-1;k++){
        System.out.print("*");
    }
    System.out.println();
}
// //lower
for(int i=mid-1;i>=1;i--){
     for(int j=1;j<=mid-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=2*i-1;k++){
        System.out.print("*");
    }
    System.out.println();
}



// PATTERN 2: Number Pattern (Hollow Middle)
// 1 2 3 4 5
// 1 2 4 5
// 1 5
// 1 2 4 5
// 1 2 3 4 5


int n=5;
int mid=n/2+1;

for(int i=1;i<=n;i++){
    int k;
    if(i<=mid){
        k=i-1;
    }
    else{
        k=n-i;
    }
int start=mid-k+1;
int end=mid+k-1;


for(int j=1;j<=n;j++){
    if(k!=0 && j>=start && j<=end){
        continue;
    }
    System.out.print(j+ " ");
}
System.out.println();

}






System.out.print("enter n: ");
int n=sc.nextInt();



//  PATTERN 3: Half Pyramid
// *
// * *
// * * *
// * * * *

for(int i=0;i<=n;i++){
for(int j=1;j<=i;j++){
    System.out.print("* ");
}
System.out.println();
}




// PATTERN 4: Diamond Star Pattern (Spaced)
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

for(int i=0;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}

for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        System.out.print("* ");
    }
    System.out.println();
}









// PATTERN 5: Right Aligned Triangle
//     *
//    **
//   ***  
//  **** 
// *****

for(int i=1;i<=n;i++){
    for(int j=n-i;j>0;j--){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print("*");
    }
    System.out.println();
}


// ........... or .............

for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print("*");
    }
    System.out.println();
}






// PATTERN 6: Spaced Diamond
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *


for(int i=1;i<=n;i++){
    for(int j=n-i;j>0;j--){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print("* ");
    }
    System.out.println();
}
 for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            // stars with space
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

