package treeSet;

import java.util.TreeSet;

public class MyComparatorMainClass {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new MyComparator());
        treeSet.add(10);
        treeSet.add(2);
        treeSet.add(2);
        treeSet.add(0);
        treeSet.add(6);
        treeSet.add(1);
        System.out.println(treeSet);
    }
}
