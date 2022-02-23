package linkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet(199, 7.5F);
        System.out.println(h.add('l'));
        System.out.println(h.add('l'));
        System.out.println(h.add('j'));
        System.out.println(h.size());
        System.out.println(h.add(null));
        System.out.println(h);

    }
    }

