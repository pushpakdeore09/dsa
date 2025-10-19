package LinkedList.DoubleLinkedList;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList(){
        this.head = null;
    }

    // Time Complexity:- O(1)
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    // Time Complexity:- O(n)
    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            insertAtFirst(data);
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Time Complexity:- O(n)
    public void insertAtPosition(int data, int index){
        if(index == 0){
            insertAtFirst(data);
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=0; i<index-1; i++){
            if(temp == null){
                System.out.println("Invalid index");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        if(temp.next != null){
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }

    // Time Complexity:- O(1)
    public void deleteAtFirst(){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head.next == null){
            head = null;
        }
        head = head.next;
        head.prev = null;
    }

    // Time Complexity:- O(n)
    public void deleteAtLast(){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head.next == null){
            head = null;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    public void deleteAtPosition(int index){
        if(index == 0){
            deleteAtFirst();
        }
        Node temp = head;
        for(int i=0; i<index-1; i++){
            if(temp == null || temp.next == null){
                System.out.println("Invalid index");
                return;
            }
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Invalid index");
        }
        temp.next = temp.next.next;
        if(temp.next != null){
            temp.next.prev = temp;
        }
    }

    // Time Complexity:- O(n)
    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.print("x");
    }
}
