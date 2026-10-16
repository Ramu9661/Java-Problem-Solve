import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int reversednumber = 0;
        while(x > 0){
            int remender = x % 10;
            reversednumber = reversednumber * 10 + x;
            x = x / 10;
        }
        return reversednumber;

    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         isPalindrome(x);
    }
}