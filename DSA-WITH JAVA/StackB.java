 import java.util.*;
 public class StackB {

    public static void PushAtbuttom(Stack<Integer> s , int data){
           if(s.isEmpty()){
              s.push(data);
              return;
           }

           int top = s.pop();
            PushAtbuttom(s, data);
            s.push(top);
    }
     public static String ReverseStr(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
             
            s.push(str.charAt(idx));
            idx++;
        }
  
        StringBuilder result = new StringBuilder("");
              while(!s.isEmpty()){
                  char curr = s.pop();
                  result.append(curr);
              }

              return result.toString();
     }
    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        
        // PushAtbuttom(s, 4);

        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }

        String str = "abc";
        String  result = ReverseStr(str);
        System.out.print(result);
    }
}
