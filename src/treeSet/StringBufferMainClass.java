package treeSet;

import java.util.TreeSet;

public class StringBufferMainClass   {
    public static void main(String[] args) {
    TreeSet treeSet = new TreeSet(new MyComparator());
    treeSet.add(new StringBuffer("Z"));
    treeSet.add(new StringBuffer("k"));
    System.out.println(treeSet);
        System.out.println("A".compareTo("Z"));
        System.out.println("A".compareTo("A"));

    }
}
