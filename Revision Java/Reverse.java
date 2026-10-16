public class Reverse{
    public static void ReverseArray(int Num[]){
      int start=0, end=Num.length-1;
          while(start<end){
        int temp=Num[end];
        Num[end]=Num[start];
        Num[start]=temp;
         start++;
         end--;
      }
    }
    public static void main(String []args){
        int Num[]={9,8,7,6,5,4,3,2,1};
        ReverseArray(Num);
      for(int i=0; i<=Num.length-1; i++){
          System.out.print(Num[i]+",");
      }
      System.out.println();
    }
}