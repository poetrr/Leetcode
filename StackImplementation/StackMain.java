package StackImplementation;

public class StackMain {
    public static void main(String[] args) {
        CustomStack c=new CustomStack(2);
        c.push(4);
        c.push(5);
        c.push(6);

        CustomStack d=new DynamicStack(2);
        d.push(4);
        d.push(5);
        d.push(6);

    }
}
