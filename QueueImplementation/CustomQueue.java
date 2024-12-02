package QueueImplementation;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=-1;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }
    protected  boolean addLast(int item){
        if(isFull()){
            System.out.println("Stack is full cannot insert");
            return false; 
        }
        end++;
        data[end]=item;
        return true;
    }
    protected boolean addFront(int item)throws Exception{
        if(isEmpty()){
            end ++;
            data[end]=item;
            return true;
        }
        if(isFull()){
            throw new Exception("Queue is full");
        }
        for(int i=end;i>=1;i--){
            data[i+1]=data[i];
        }
        System.out.println("Item added in front of the queue");
        data[0]=item;
        return true;

    }
    protected int removeFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    protected int removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[end];
        end--;
        return removed;
    }
    protected void display(){
        for(int i=0;i<end;i++){
            System.out.println(data[i]);
        }
    }
    protected int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");  
        }
        return data[end];
    }
    protected boolean isFull(){
        return end==data.length-1;
    }
    protected boolean isEmpty(){
        return end==-1;
    }
    
}
