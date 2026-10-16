public class BinarySearch {
    public static int b_search(int nums[], int key){
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = (start+end)/2;

            if(nums[mid] == key){
                return mid;
            }else if(nums[mid] > key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {7,6,4,2,1,3,9,5};
        int key = 3;

        System.out.println("key is at index = "+b_search(nums, key));
    }
}
