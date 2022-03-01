package collections.sort;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionSortDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("h");
        l.add("5");
        l.add("8.9");
        l.add("o");
        l.add("true");
        System.out.println(l);
        MyConparator myConparator = new MyConparator();
        Collections.sort(l,myConparator);
        System.out.println(l);
    }
}
