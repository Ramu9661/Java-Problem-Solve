import java.util.*;
import java.util.function.DoubleToIntFunction;

public class Ramu {

//    (1)  print hollow ractangle
   
//     public static void pyramid(int rows,int col){
          
//         //Scanner sc = new Scanner(System.in);
//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=col;j++){
//                 if(i==1||i==rows||j==1||j==col){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
            
//         }
          
//     }/

// print tringle pattern                
public static void pyramid(int n){
    
    for(int i=1;i<=n;i++){
         int space = n-i;
        for(int j=1;j<=space;j++){
                System.out.print(" ");
        }
        int star = 2*i-1;
        for(int k=1;k<=star;k++){
               System.out.print("*");
        }
        System.out.println();
    }
}

// print butterfly pattern
    public static void butterfly(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {  // print stars
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++) {  //print spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {  // print stars
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) {  // print stars
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++) {  //print spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {  // print stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
       // pyramid(4, 5);
       butterfly(8);
    }
}
public static void main(int a int b) {
    System.out.println(2+3);
} 