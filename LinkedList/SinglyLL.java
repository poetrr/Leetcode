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
    public void deleteFirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
    public void deleteLast(int lastNodesDelete){
        if(size<=1){
            deleteFirst();
            return;
        }
        Node prev=getPrevious(size-lastNodesDelete);
        tail=prev;
        prev.next=null;
       
    }
    public void deletePosition(int position){
        if(position==0){
            deleteFirst();
            return;
        }
        if(position==size-1){
            deleteLast(position);
            return;
        }
        Node prev=getPrevious(position-1);
        prev.next=prev.next.next;

       
    }
    public Node getPrevious(int number){
        Node temp=head;
        for(int i=0;i<number;i++){
            temp=temp.next;
        }
        return temp;
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
        list.insertFirst(3);
        list.insertLast(7);
        list.display();

        list.deleteFirst();
        list.display();
        list.deleteLast(2);
        list.display();
        list.deletePosition(0);
        list.display();
    }

}

