package treeSet;

import java.util.TreeSet;

public class NavigableSet {
    public static void main(String[] args) {
        TreeSet <Integer> treeSet = new TreeSet<Integer>();
        treeSet.add((100));
        treeSet.add(2000);
        treeSet.add(3000);
        treeSet.add(4000);
        treeSet.add(5000);
        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(2000));
        System.out.println(treeSet.lower(2000));
        System.out.println(treeSet.floor(1000));
        System.out.println(treeSet.higher(4000));
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet);
        System.out.println(treeSet.descendingIterator());
    }
}
