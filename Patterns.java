public class Patterns {
    public static void Rotated_Parmid(int n){
        for(int i=1; i<=n; i++){
            // space
            for(int j=i; j<=n-1; j++ ){

                System.out.print(" ");
            //star
            }for(int j=1; j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Hollow(int totRows , int totColumn){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totColumn; j++){
                if(i==1 || i==totRows || j==1 || j==totColumn){
                        System.out.print("*");
                
                }else{  
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void NumPramid(int n)
    {     
        for(int i=1; i<=n; i++){
            for(char chars=1; chars<=n-i+1; chars++){
               System.out.print(chars+" ");
            }
        System.out.println();
        }
        
    }  
    public static void FloydsTriengle(int n){
         int  counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            System.out.print(counter+" ");
            counter++;
            } System.out.println();
        }
    }   
      public static void BinaryT(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.println("0");
                }
            }
        }
      }
      public static void Butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int s=1; s<=i; s++ ){
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for(int s=1; s<=i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    
      for(int i=n; i>=1; i--){
        for(int s=1; s<=i; s++ ){
            System.out.print("*"); 
        }
        for(int k=1; k<=2*(n-i); k++){
            System.out.print(" ");
        }
        for(int s=1; s<=i; s++){
            System.out.print("*");
        }
        System.out.println();
    
      }
    
    }
    public static void Solid_Rombs(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int s=1; s<=n; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Hollow_Rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
          }
        }
    
    public static void main(String args[]){
        //  Rotated_Parmid(5);
        // Hollow(4, 4);
        // NumPramid(5);
        //FloydsTriengle(5);
        // BinaryT(5);
        // Butterfly(4);
        //  Solid_Rombs(5);
        // Hollow_Rhombus(5);
        Diamond(4);
    }
    
}
