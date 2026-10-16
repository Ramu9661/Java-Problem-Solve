import java.util.Stack;

public class Solution {
    public static boolean isDuplicat(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);

           if(ch == ')'){
             int count = 0;
             while(s.pop() != '('){
                count++;
             }

             if(count < 1){
                 return true;
             }
           }
           else{
              s.push(ch);
           }
        }

        return false;
    }
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                 s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            } 

            else{
               nsr[i] = s.peek();
            }

            s.push(i);
        }
        s = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                 s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            } 

            else{
               nsl[i] = s.peek();
            }

            s.push(i);
        }

        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currmax = height*width;
            maxArea =Math.max(maxArea, currmax);
        }
        System.out.println("the maxArea is :" + maxArea);
    }
    public static void main(String args[]){
        // String str = "((a+b)+(a+c))";
        // String str2 = "((a+b)(b+c))";
        // System.out.println(isDuplicat(str2));
        int arr[] = {1,4,3};
        maxArea(arr);
    }
}
