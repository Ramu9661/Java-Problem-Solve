public class Pattern {
    public static void pattern(int n){

   //     tringle pattern
        //      int count = 0;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //        System.out.print(count);
        //        count++;
        //     }
        //     System.out.println();
        // }

  
        // for(int i=1;i<=n;i++){
        //      int spaces = n-i;
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //      int stars = i;
        //     for(int j=1;j<=stars;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        for(int i=1;i<=n;i++){
            int spaces = n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            int stars = 1;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
                 stars = stars+2;
            }
            System.out.println();
        }

    }
    public static void main(String args[]){ 
       pattern(6);
    }
}
