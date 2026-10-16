public class Leetcode {
        public static int removeDuplicates(int[] nums) {
            int k = 0;
            for(int i=1; i<nums.length; i++){
                if(nums[k] != nums[i]){
                     k++;
                  nums[k] = nums[i];
                  
                }
            }
            return k+1;
     }
     
     public static void main(String[] args) {
        int nums[]= {0,0,1,1,1,2,3,3,3};
         int print = removeDuplicates(nums);
         for(int i = 0; i<print; i++){
         System.out.print(nums[i]+" ");
         }
     }
 }
