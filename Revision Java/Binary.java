public class Binary {
    public static int linearsearch(int Arr[], int target){
        for(int i=0; i<Arr.length; i++){
            if(Arr[i]==target){
                System.out.println("Present Element at index="+i);
            }
        }
        return-1;
    }
    public static int BinarySearch(int Arr[], int target){
        int start=0,end=Arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(Arr[mid]==target){
                return mid;
            }if(Arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return-1;
    }
    public static void main(String[] args){
        int Arr[]={2,4,6,7,8,9};
        int target=9;
         linearsearch(Arr, target);
        // System.out.println("Present element at index:="+BinarySearch(Arr, target));

    }
}
