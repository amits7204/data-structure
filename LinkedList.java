public class LinkedList{
    Node head;
    Node temp;
    /**
     * Create a Node
     */
    public class Node{
        int data;
        Node next = null;
    }

    public void insertData(int aData){
        Node lNode = new Node();
        lNode.data = aData;
        lNode.next = head;
        head = lNode;
    }
    public void display(){
        temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
    }
public static void main(String[] args){
    LinkedList lObj = new LinkedList();
    lObj.insertData(10);
    lObj.insertData(20);
    lObj.display();
}
}