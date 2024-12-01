import java.util.*;
public class StackGenerics{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}