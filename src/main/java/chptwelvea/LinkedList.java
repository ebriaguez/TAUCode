package chptwelvea;
import java.util.Queue;

public class LinkedList {
    public static void main(String[] args) {
        Queue fruit = (Queue) new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);

        System.out.println(fruit.peek());
    }
}
