public class Arrays {
    public static int binarysearch(int Numbers[] , int key){
        int start=0 , end=Numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(Numbers[mid] == key){
                return mid;
            }
            if(Numbers[mid] < key){
                return mid+1;
            }else{
                return mid-1;
            }
        }
        return -1;
     }
    public static void ReverseArray(int Numbers[]){
        int first = 0 , last = Numbers.length-1;
        while(first < last){
            int temp = Numbers[last];
            Numbers[last]=Numbers[first];
            Numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void main (String args []){
        int Numbers[] = {2 , 4, 6, 8, 10, 12 };
        // int key = 10;
    //  System.out.println("found index:"+binarysearch(Numbers, key));
    ReverseArray(Numbers);
    for(int i=0; i<Numbers.length; i++){
        System.out.print(Numbers[i]+" ");
    }
    System.out.println();
   }

}
