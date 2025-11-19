class Node{
    int data;
    Node next;
    Node prev;


    Node(int data1,Node next1,Node prev1){
        this.data = data1;
        this.next = next1;
        this.prev = prev1;  
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList{
    private static Node convertArr2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i= 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            prev.next=temp;
            prev = temp;
        }
        return head;
    }

    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;

        }
    }

    private static Node Deletehead(Node head){
        Node temp = head.next;
        head = head.next;
        temp.prev = null;
        return head;
    }

    private static Node Removelast(Node head){
        if(head==null||head.next==null)return null;

        Node temp = head;
    while(temp.next!=null){
        temp = temp.next;
    }
    Node ttemp = temp.prev;
        ttemp.next = null;
        temp.prev = null;
    return head;
    }


    public static void main(String[] args) {
        int[] arr = {2,4,5,6};

    Node head = convertArr2DLL(arr);
    print(head);

    // head = Deletehead(head);
    // print(head);

    head = Removelast(head);
    print(head);




    

    }
}