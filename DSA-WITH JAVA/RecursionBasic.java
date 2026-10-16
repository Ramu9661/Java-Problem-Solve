import java.rmi.Remote;
import java. util.*;

public class RecursionBasic {
 // natural no decreasing order
    public static void Printdec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        Printdec(n-1);
    }
 // natural no increasing order
   public static void PrintInc(int n){
    if(n==1){
        System.out.print(n+" ");
        return;
    }
      PrintInc(n-1);
      System.out.print(n+" ");
   }
//    factorial 
    public static int calfactorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1= calfactorial(n-1);
        int fn=n*calfactorial(n-1);
        return fn;
    }
      //sum of narural Num
      public static int calcSum(int n){
        if (n==1)  {
           return 1;
        }
        int Sm= calcSum(n-1);
        int Csm=n+Sm;
        return Csm;
      }
    //   Fibonacci series
    public static int fib(int n){
        if(n==0 || n==1){
            return n;

        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        int fn=f1+f2;
        return fn;
    }
    // tiling problem 
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);
        int Tolways = fnm1+fnm2;
        return Tolways;
    }
    public static void RemoveDublicate(String str , int idx , StringBuilder newStr, boolean map[] ){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            RemoveDublicate(str, idx+1, newStr, map);
        }else{
            map[currchar-'a']=true;
            RemoveDublicate(str, idx+1, newStr.append(currchar), map);
        }
        
    }
    public static void main(String[] args) {
        //  int n=5;
        //Printdec(n);
        // PrintInc(n);
       // System.out.println(calfactorial(n));
        // System.out.println(calcSum(n));
        // System.out.print(fib(n));
        // System.out.println(tilingProblem(n));
     //   System.out.println(RemoveDublicate(null, n, null, map[26]));
    }
}
