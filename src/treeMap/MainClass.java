package treeMap;

import java.util.TreeMap;

public class MainClass {
    public static void main(String[] args) {
        TreeMap t = new TreeMap();
        t.put(3,"ratan");
        t.put(1,"sam");
        System.out.println(t);
        t.put(4,7);
        System.out.println(t);
    }
}
