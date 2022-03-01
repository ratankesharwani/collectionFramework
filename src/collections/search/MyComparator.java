package collections.search;

import java.util.Comparator;

public class MyComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        String I1 = o1.toString();
        String I2 = o2.toString();
        return -I1.compareTo(I2);
    }
}
