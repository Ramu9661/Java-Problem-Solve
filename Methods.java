

public class Methods {
     public static int multiply(int a , int b){
        int multi = a*b;
        return multi;
     }
     public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
     }
     public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nsr = factorial(n-r);
        int bincoeff =  fact_n/(fact_r-fact_nsr);
     
     return bincoeff; 
     }
     public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime=false;
            }
        } return isPrime;
     }
     public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" "); 
            }
            

        }
        System.out.println();
     }
    public static void main(String args[]){
        // System.out.println(bincoeff(5,3));
       //  System.out.println(isPrime(12));
          primesInRange(10000);
    }
    
}
