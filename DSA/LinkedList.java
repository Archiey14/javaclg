class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class LinkedList{
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover= head;
        for(int i= 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }

    private static void traversal(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);;
            temp = temp.next;
        }
    }

    private static int Lengthofll(Node head){
        int count = 0 ;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    private static int Searching(Node head,int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data==val){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }

    private static Node Deletehead(Node head){
        Node temp = head;
        head = head.next;
        return head;
    }

    private static Node Removelast(Node head){
        if(head==null||head.next==null)return null;

        Node temp = head;
    while(temp.next.next!=null){
        temp = temp.next;
    }
    temp.next = null;
    return head;
    }

    // private static Node Deletekth(Node head){
    //     if(head==null)return head;

    //     if(k==1)Deletehead(head);

    //     int count = 0;
    //     Node temp = head;
    //     Node prev = null;

    // while(temp!=null){
    //     temp=

    // }

    // }

    private static Node insertAtBeginning(Node head,int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        return head;
    }

    private static Node insertAtEnd(Node head,int val){
        Node newNode = new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    private static Node insertAfterGivenData(Node head,int x,int val){
        Node temp = head;
        while(temp.data!=val){
            temp = temp.next;
        }
        Node ntemp = temp.next;
        Node newNode = new Node(x);
        temp.next=newNode;
        newNode.next=ntemp;

        return head;
    }

    private static void print(Node head){
    while(head!=null){
        System.out.print(head.data+" ");
        head = head.next;
    }
    }

    private static Node insertBeforeGivenData(Node head,int x,int val){
        Node temp = head;
        Node ttemp = head;
        while (temp.data!=val){
            ttemp = temp;
            temp = temp.next;
        }
        Node newNode = new Node(x);
        ttemp.next = newNode;
        newNode.next = temp;

        return head;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,5,6,8};
        Node head = convertArr2LL(arr);

        //traversal(head);

        //System.out.println(Lengthofll(head));

        //System.out.println(Searching(head,8));

        // head = Deletehead(head); 
        // print(head);

        // head = Removelast(head); 
        // print(head);

        // head = insertAtBeginning(head, 9);
        // print(head);

        // head = insertAtEnd(head, 9);
        // print(head);

        // head = insertAfterGivenData(head, 1, 5);
        // print(head);

        head = insertBeforeGivenData(head, 1, 5);
        print(head);


    }
}
