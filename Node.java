public class Node {
    int data;
    Node next;

     Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Main {
     static Node head;
    public static void transerval() {
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        
}