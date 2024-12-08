package LinkedList;

public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;
   
    public SinglyLL(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    public void insertFirst(int value){
        Node n=new Node(value);
        n.next=head;
        head=n;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node n=new Node(value);
        tail.next=n;
        tail=n;
        size++;
    }
    public void insertPlace(int value,int place){
        if(place==0){
            insertFirst(value);
            return;
        }
        if(place==size-1){
            insertLast(value);
            return;
        }
        Node temp=head;
        for(int i=0;i<place-1;i++){
            temp=temp.next;
        }
        Node n=new Node(value);
        n.next=temp.next;
        temp.next=n;
        size++;
    }
    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    
    
    public static void main(String[] args) {
        SinglyLL list=new SinglyLL();
        list.insertPlace(5,0);
        list.insertFirst(2);
        list.insertLast(4);
        list.display();
    }

}

