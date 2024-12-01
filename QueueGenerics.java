import java.util.LinkedList;
import java.util.Queue;

public class QueueGenerics {
    public static void main(String[] args) {
        Queue q=new LinkedList<>();
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        System.out.println(q.remove());

    }
}
