package treeSet;

import java.util.TreeSet;

public class HetrogeneousMainClass {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new MyComparator());
        treeSet.add(new StringBuffer("Z"));
        treeSet.add(new StringBuffer("k"));

        // string according to length ;

        treeSet.add('A');
        treeSet.add("imjsh");
        treeSet.add(9);
        treeSet.add(-8);
        System.out.println(treeSet);
    }
}
