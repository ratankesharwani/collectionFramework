package treeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add('a');
        treeSet.add('A');
        treeSet.add('m');
        treeSet.add('Z');
        treeSet.add('o');
//        treeSet.add(null);
        System.out.println(treeSet);
    }
}
