import java.util.*;

public class AddInHeap{
    static class Heap{
        ArrayList<Integer> list = new ArrayList<>();

        public void add(int data){
            list.add(data);

            int x = list.size()-1; // x is the child 
            int par = (x-1)/2;  // par is the parent

            while(list.get(x) < list.get(par)){
                int temp = list.get(x);
                list.set(x, list.get(par));
                list.set(par, temp);
            }
        }

        public int peek(){
            return list.get(0);
        }

        public void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minidx = i;

            if(left < list.size() && list.get(minidx) > list.get(left)){
                minidx = left;
            }

            if(right < list.size() && list.get(minidx) > list.get(right)){
                minidx = right;
            }

            if(minidx != i){
                int temp = list.get(i);
                list.set(i, list.get(minidx));
                list.set(minidx, temp);
            }  
            
            heapify(minidx);
        }

        public int remove(){
            int data = list.get(0);

           // step 1 - swap 1st and last ind
           int temp = list.get(0);
           list.set(0, list.size()-1);
           list.set(list.size()-1, temp);

         //  step 2 - DELETE last
         list.remove(list.size()-1);

         //  step 3 call heapiffy
           heapify(0);
           return data;
       }
    }
}