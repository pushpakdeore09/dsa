package LinkedList.DoubleLinkedList;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        while (true) {
            System.out.println("\n1. Insert at first");
            System.out.println("2. Insert at last");
            System.out.println("3. Insert at index");
            System.out.println("4. Delete from first");
            System.out.println("5. Delete from last");
            System.out.println("6. Delete from index");
            System.out.println("7. Display");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            int data = 0;
            int index = 0;
            switch (choice) {
                case 1:
                    System.out.println("Enter data: ");
                    data = sc.nextInt();
                    dll.insertAtFirst(data);
                    break;
                case 2:
                    System.out.println("Enter data: ");
                    data = sc.nextInt();
                    dll.insertAtLast(data);
                    break;
                case 3:
                    System.out.println("Enter data: ");
                    data = sc.nextInt();
                    System.out.println("Enter index: ");
                    index = sc.nextInt();
                    dll.insertAtPosition(data, index);
                    break;
                case 4:
                    dll.deleteAtFirst();
                    break;
                case 5:
                    dll.deleteAtLast();
                    break;
                case 6:
                    System.out.println("Enter index: ");
                    index = sc.nextInt();
                    dll.deleteAtPosition(index);
                    break;
                case 7:
                    dll.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
