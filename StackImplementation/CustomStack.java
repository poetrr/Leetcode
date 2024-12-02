package StackImplementation;
public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data =new int[size];
    }

    protected boolean push(int item){
        if(isFull()){

            return false;
        }
        ptr++;
        data[ptr]=item;
        System.out.println(item + "  Inserted successfully");
        return true;
    }

    protected int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }

        int removed=data[ptr];
        ptr--;
        return removed;
    }
    protected int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("No top element to display in the empty stack");
        }
        return data[ptr]; 
    }



    protected boolean isEmpty(){
        return ptr==-1;
    }
     
    protected  boolean isFull(){
        if(ptr==data.length-1){
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }
    
}
