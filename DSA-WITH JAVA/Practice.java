public class Practice {
    public static void main(String[] args) {
        // float marks[] = {67.3f,43.5f,68.0f,80.2f,78.5f};
        // float sum=0; 
        // for(float element:marks  ){
        //     sum=sum+element;
           
        // }
        // System.out.println(sum);

        // String str="ApnaCollege".replace("e","a");
        // System.out.println(str);

        
        // String str="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));
       int n=10;
       int a=0 , b=1;
       System.out.println("fibonacci"+n);
       for(int i=1; i<=n; i++){
        System.out.print(a+" ");
        int next=a+b;
         a=b;
         b=next;
       }

    }
}
