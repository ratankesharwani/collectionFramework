package collections.search;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class BinarySearchList {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("h");
        l.add("5");
        l.add("8.9");
        l.add("o");
        l.add("true");
        System.out.println(l);
        MyComparator myComparator = new MyComparator();
        Collections.sort(l,myComparator);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);

        System.out.println(Collections.binarySearch(l,"h",myComparator));
        System.out.println(Collections.binarySearch(l,"i"));
        Collections.reverseOrder(myComparator);
    }
}
