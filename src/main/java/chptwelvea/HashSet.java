package chptwelvea;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {

        Set fruit = (Set) new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
    }
}
