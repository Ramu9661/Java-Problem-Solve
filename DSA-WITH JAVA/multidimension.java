public class multidimension {
    public static void Spiralmatrix(int Matrix[][]){
        int startRow=0;
        int startcol=0;
        int endRow=Matrix[0].length-1;
        int endcol=Matrix.length-1;

        while(startRow<=endRow && startcol<=endcol){

            for(int j=startRow; j<=endcol;  j++){
                System.out.print(Matrix[startRow][j]+" ");

             }
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(Matrix[i][endcol]+" ");
            }
            for(int j=endcol-1; j>=startcol; j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(Matrix[endRow][j]+" ");
            }
            for(int i=endRow-1; i>=startRow+1; i--){
               if(startcol==endcol){
                break;
               }
               System.out.print(Matrix[i][startcol]+" ");
            }
            startcol++;
            startRow++;
            endcol--;
            endRow--;
        }
        System.out.println();
    }
     public static boolean ispalindrome(String str){
          int left = 0;
          int right = str.length()-1;
          while(left <= right){
             
             if(str.charAt(left) != str.charAt(right)){
                 return false;
             }
             left++;
             right--;
          }
          return true;
     }


    public static void main(String[] args){
        int Matrix[][]={{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16} };

          Spiralmatrix(Matrix);    
        // String str="racecar";   
        // System.out.println(ispalindrome(str)); 
    }
    
}
