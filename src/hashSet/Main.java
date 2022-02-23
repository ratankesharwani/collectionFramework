package hashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet h = new HashSet(199, 7.5F);
        System.out.println(h.add('l'));
        System.out.println(h.add('l'));
        System.out.println(h.add('j'));
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.toArray());
        System.out.println(h.iterator());
        System.out.println(h.add(null));
        System.out.println(h);

    }
}
