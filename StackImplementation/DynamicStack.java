package StackImplementation;
public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
        if(this.isFull()){
            //double the array size
            System.out.println("Increasing the array size");
            int[] temp=new int[data.length*2];
            //copy all the previous items in new data
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        //If the array is not full
        return super.push(item);
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
