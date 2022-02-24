package treeSet;

import java.util.TreeSet;

public class StringMainClass {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new MyComparator());
        treeSet.add("ratan");
        treeSet.add("sam");
        treeSet.add("imjsh");
        treeSet.add("ijhbcdfgh");
        System.out.println(treeSet);
    }
}
