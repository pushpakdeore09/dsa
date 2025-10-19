package LinkedList.SingleLinkedList;

import java.util.Scanner;

public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList(){
        this.head=null;
    }

    // Time Complexity:- O(1)
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Time Complexity:- O(n)
    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Time Complexity:- O(n)
    public void insertAtPosition(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            insertAtFirst(data);
        } else {
            Node temp = head;
            for(int i=0; i<index-1; i++){
                if(temp == null){
                    System.out.println("Index not valid!");
                    return;
                }
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Time Complexity:- O(1)
    public void deleteAtFirst(){
        if(head == null){
            System.out.println("List is empty!");
        }
        head = head.next;
    }

    // Time Complexity:- O(n)
    public void deleteAtLast(){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next != null && temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    // Time Complexity:- O(n)
    public void deleteAtPosition(int index){
        if(index == 0){
            deleteAtFirst();
        }
        Node temp = head;
        for(int i=0; i<index-1; i++){
            if(temp == null || temp.next == null){
                System.out.println("Index invalid!");
                return;
            }
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        } else {
            System.out.println("Index invalid!");
        }
    }

    // Time Complexity:- O(n)
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("x");
    }



}
