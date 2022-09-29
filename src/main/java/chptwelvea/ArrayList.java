package chptwelvea;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List fruit = (List) new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);
    }
}
