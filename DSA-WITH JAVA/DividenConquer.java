public class DividenConquer {
    public static void printArr(int Arr[]){
        for(int i=0; i<=Arr.length-1; i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
   //margesort code 
    public static void mergesort(int Arr[] , int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;

        mergesort(Arr, si, mid);

        mergesort(Arr, mid+1, ei);
          
        merge(Arr , si , mid ,ei);
    }
    public static void merge(int Arr[], int si ,int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i=si; 
        int j=mid+1;
        int k=0;

        while(i <= mid && j <= ei){
            if(Arr[i]<Arr[j]){
               temp [k]=Arr[i];
               i++;
            }else{
                temp[k]=Arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++]=Arr[i++];
        }
         while(j<=ei){
            temp[k++]=Arr[j++];
         }
        for(k=0, i=si; k<temp.length; k++, i++) {
            Arr[i]=temp[k];
            
           
         
        }
        
    }
   //Quick sort code
   public static void Quicksort(int Arr[], int si, int ei){
    if (si>=ei){
        return;
    }
    int pidx=partition(Arr, si , ei);
      Quicksort(Arr, si, pidx-1);
      Quicksort(Arr, pidx+1, ei);
   } 
   public static int partition(int Arr[], int si , int ei){
     int pivot=Arr[ei];
     int i=si-1;
     for(int j=si; j<ei; j++){
        if(Arr[j]<=pivot){
            i++;
            int temp=Arr[j];
            Arr[j]=Arr[i];
            Arr[i]=temp;
        }
     }
      i++;
      int temp=pivot;
      Arr[ei]=Arr[i];
      Arr[i]=temp;
      return i;
   }
     public static int Search(int arr[], int target, int si , int ei){
        if(si>ei){
            return-1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        if (arr[si]<=arr[mid]){
            if(arr[si]<=target && target <= arr [mid]){
                return Search(arr, target, si, mid-1);
            }else{
                return Search(arr, target, mid+1, ei);
            } 
        }
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                return Search(arr, target, mid+1, ei);
            }
            else{
                return Search(arr, target, mid, mid-1);
            }
        }
     }
    public static void main(String[] args){
     

        // int Arr[]={5,3,4,7,8,2,9};
        // mergesort(Arr, 0, Arr.length-1);
        //  printArr(Arr);
        //  Quicksort(Arr, 0, Arr.length-1);
        //  printArr(Arr);
        int arr[]={3,4,5,6,0,1,2};
        int target=0;
        int taridx=Search(arr, target, 0, arr.length);
        System.out.print(taridx);
    }
}
