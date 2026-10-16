public class Linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
           this.data = data;
           this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void Addfirst(int data){
        Node newhead = new Node(data);
        size++;
     if(head==null){
       head=tail=newhead;
       return;
      }

      newhead.next = head;

      head = newhead;
    }

    public void Addlast(int data){
        Node newhead = new Node(data);
        size++;
        if ( head == null){
            head = tail = newhead;
            return;
        }

        tail.next = newhead;
        tail = newhead;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
          System.out.print(temp.data+"->");
          temp = temp.next;
        }
        System.out.println("null");
    }

    public void Add(int idx, int data){
        if(idx == 0){
            Addfirst(data);
            return;
        }
        Node newhead = new Node(data);
        size++;
        Node temp  = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newhead.next = temp.next;
        temp.next = newhead;
    }
    public int Removehead(){
        if(size == 0){
            System.out.println("linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }
    public int Removetail(){
        if(size == 0){
            System.out.println("linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
         prev.next = null;
         tail = prev;
         size--;
         return val;
    }
    public int llSearch(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp=temp.next;
            i++;
        }

        return -1;
    }
    public void revll(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
      head =prev;
    }


    public void deletenthfromend(int n){
        int sz = 0;
        Node temp = head;
        while ( temp != null) {
              temp = temp.next;
              sz++;
        }
         
        if (n == sz){
            head = head.next;
            return;
        }

        int i = 1;
        int find = sz-n;
        Node prev = head;
        while( i < find){
            prev = prev.next;
            i++;
        }


        prev.next = prev.next.next;
        return;
    }
    private Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
       return slow;
    }

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }

         Node mid = findmid(head);
         Node curr = mid;
         Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
                 prev = curr;
                 curr = next;
        }


        
    }
      public static boolean CycleLL(){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }

            return false;
      }

      public static void removecycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while ( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if (cycle == false){
            return;
        }


        slow = head;
        Node prev = null;
        while ( slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

          prev.next = null;
      }
// Merge Sort code in linkedlist
      private Node GetMid(Node head){
           Node slow = head;
           Node fast = head.next;
           while(fast != null && fast.next != null){
                  slow = slow.next;
                  fast = fast.next.next;
           }

           return slow;
      }

      private Node Merge( Node head1 , Node head2){
          Node mergeLL = new Node(-1);
          Node temp = mergeLL;
          while ( head1 != null && head2 != null){
                 if(head1.data <= head2.data){
                    temp.next = head1;
                        head1 = head1.next;
                         temp = temp.next;
              } else {
                       temp.next = head2;
                           head2 = head2.next;
                            temp = temp.next;
              }
          }
          while(head1!=null){
            temp.next = head1;
                head1 = head1.next;
                 temp = temp.next;
          }
          while(head2 != null){
             temp.next = head2;
                 head2 = head2.next;
                  temp = temp.next;
          }

          return mergeLL.next;
      }

      public Node mergesort(Node head){
        if( head == null || head.next == null){
            return head;
        }

        Node mid = GetMid(head);

        Node righthead = mid.next;
         mid.next = null;

        Node newLeft = mergesort(head);

        Node newRight = mergesort(righthead);

           return Merge( newLeft, newRight);
      }
public static void main(String[] args) {
     Linkedlist ll = new Linkedlist();
          ll.Addfirst(1);
          ll.Addfirst(2);
          ll.Addlast(3);
          ll.Addlast(4);
        //   ll.Add(2, 8);
    //       ll.print();
        //   System.out.println(ll.size);
        //  ll.Removehead();
        //  ll.Removetail();
        //  ll.print();
        // System.out.println(ll.llSearch(2));
      //    System.out.println(ll.llSearch(6));
             /*  ll.revll();
              ll.print();*/
            //   ll.deletenthfromend(3);
            //   ll.print();


        /*   head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
             head.next.next.next = head.next;
            System.out.println(CycleLL());
            removecycle();
            System.out.println(CycleLL());    */ 
        
         ll.print();
        ll.head =  ll.mergesort(ll.head);
         ll.print();

    }
}
