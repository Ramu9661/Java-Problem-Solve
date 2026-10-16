public class Revision {
  public static int LinearSearch(int Nums[] , int key){
      for(int i=0; i<Nums.length; i++){
        if(Nums[i]==key){
          System.out.println("Index"+i);
        }
      }
      return-1;
  }
  public static void main(String args[]){
      int Nums[]={2,3,4,5,7,90,};
      int key = 90;
      LinearSearch(Nums, key);
    }
}
