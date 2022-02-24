package userDefinedComparator_TreeSet;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        UserDefinedPerson u1= (UserDefinedPerson) o1;
        UserDefinedPerson u2 = (UserDefinedPerson) o2;
        String s1 = u1.name;
        String s2 = u2.name;
        return s1.compareTo(s2);
    }
}
