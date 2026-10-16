import java.util.*;
public class Algsort {
    public static void bubbleSort(int Arr[]){
        for(int turn=0; turn<Arr.length-1; turn++){
            for(int j=0; j<Arr.length-1-turn; j++){
                   if(Arr[j]>Arr[j+1]){
                    int temp=Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]=temp;
                   }
            }
        }
    }


   
   
    public static void sectionsort(int Arr[]){
        for(int i=0; i<Arr.length-1; i++){
            int minposition=i;
            for(int j=i+1; j<Arr.length; j++){
                if(Arr[minposition]>Arr[j]){
                minposition=j;
                }
            }
            int temp=Arr[minposition];
               Arr[minposition]=Arr[i];
               Arr[i]=temp;
        }
        
    }
    public static void insertionsort(int Arr[]){
        for(int i=0; i<Arr.length; i++){
            int curr=Arr[i];
            int prev=i-1;
            while(prev>=0 && Arr[prev]>curr){
                 Arr[prev+1]=Arr[prev];
                 prev--;
            }
            Arr[prev+1]=curr;
            prev++;
        }
        
    }
    public static void Sorting(int Arr[]){
        for(int i=0; i<=Arr.length; i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
       int Arr[]={7,2,4,9,6,8,3};
    //    bubbleSort(Arr);
        //  sectionsort(Arr);
        insertionsort(Arr);
       Sorting(Arr);
    }
}