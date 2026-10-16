import java.util.*;

public class Loop {
    public static void main(String args[]){
      
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
            if(n==2){
        System.out.println("prime");
      } else{
      boolean isPrime = true;
      for(int i=2; i<=Math.sqrt(n); i++){
        if(n % i==0){
          isPrime=false;

        }
      }
      if(isPrime=true){
        System.out.println("Prime number");
      }
      else{
        System.out.println("Not Prime number");
      }
    }
  }
// }
    // for(int i=0; i<5; i++){
    //   System.out.println("hello");
    //   i+=2;
    // }
//     int i = 0;
//     while(i<5){
//       System.out.println("hello");
//       i++;
//       i+=2;
//     }
//   }
// }
//    int i =8;
//    do{
//     System.out.println("hello");
//     i++;
//     i+=2;

//    }while(i<5);
//   }
// }
//      int sum = 0;
//     for(int i=1; i<=9; i++){
//       sum+=i;
//       System.out.print(sum+" ");
//     }
//   }
// } 
  //  int sum = 1;
  //  int i = 1;   
  //  do{
  //   System.out.print(sum+" ");
  //   sum+=i;
  //   i++;
  //  }while(i<=11);

  //  }
  // }
//     for(int i=1; i<=5; i++){
//       for(int star=1; star<=i; star++){
//         System.out.print("*");
//       }
//       System.out.println( );
//     }
//   }
// }
//     int i =1;
//     int star=1;
//     while(i<=5){
//       while(star<=i){
//         System.out.print("*");
//         star++;
        
//       }
//       i++;
//       System.out.println( );
//     }
//     int n = 5;
//      for(int i=0;i<=n;i++){
//         for(int j=0;j<=i;j++){
//           System.out.print("*");
//         }
//         System.out.println();
//       }
//     }
// // }
//     int sum=0;
//     int i=1;
//     while(i<=5){
//       System.out.print(sum+" ");
//       sum+=i;
//       i++;
//     }
//  }
  //}
  //      int sum =0;
  //    for(int i=1; i<=5; i++ ){
  //     System.out.print(sum+" ");
  //     sum+=i;
  //    }
  //   }
  //     int n=5;
  //     for(int i=1; i<=n; i++){
  //       for(int s=1; s<=n-i+1; s++){
  //         System.out.print("*");
  //       }
  //       System.out.println();
  //     }
  //   }
  // }
//   int n =5;
//   for(int i=1; i<=n; i++){
//     for(int number=1; number<=i; number++){
//       System.out.print(number);
//     }
//     System.out.println();
//   }
//  }
// }
   //revarse number
//    int n = 1008229;
  //  while(n>0){
  //   int lastDigit = n%10;
  //   System.out.print(lastDigit+" ");
  //   n=n/10;

  //  }
  //  System.out.println();
  // }
// }
// int n = 5;
// char ch = 'A';

// for(int  i=1; i<=n; i++){
//   for(int  chars=1; chars<=i; chars++){
//     System.out.print(ch+" ");
//     ch++;
//   }
//   System.out.println();
//     }
//    }
//  }