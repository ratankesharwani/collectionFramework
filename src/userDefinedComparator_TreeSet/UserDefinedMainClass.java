package userDefinedComparator_TreeSet;

import java.util.TreeSet;

public class UserDefinedMainClass {
    public static void main(String[] args) {
        UserDefinedPerson userDefinedPerson1 = new UserDefinedPerson(6,"ratan");
        UserDefinedPerson userDefinedPerson2 = new UserDefinedPerson(1,"sam");
        UserDefinedPerson userDefinedPerson3 = new UserDefinedPerson(2,"rajan");
        UserDefinedPerson userDefinedPerson4 = new UserDefinedPerson(4,"komal");
        UserDefinedPerson userDefinedPerson5= new UserDefinedPerson(8,"shobhna");
        TreeSet treeSet = new TreeSet();
        treeSet.add(userDefinedPerson1);
        treeSet.add(userDefinedPerson2);
        treeSet.add(userDefinedPerson3);
        treeSet.add(userDefinedPerson1);
        treeSet.add(userDefinedPerson4);
        treeSet.add(userDefinedPerson5);
        System.out.println(treeSet);
        System.out.println("--------------------------------------------------");
        TreeSet treeSet2 = new TreeSet(new MyComparator());
        treeSet2.add(userDefinedPerson1);
        treeSet2.add(userDefinedPerson2);
        treeSet2.add(userDefinedPerson3);
        treeSet2.add(userDefinedPerson1);
        treeSet2.add(userDefinedPerson4);
        treeSet2.add(userDefinedPerson5);
        System.out.println(treeSet2);
    }
}
