package arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList implements Comparable{
    public static void main(String[] args) {
        //ONLY A LIST VIEW PF ARRAY-----------
        String[] s= {"A","B","C"};
        List l = Arrays.asList(s);
        System.out.println(l);
        // BUT WORTH-FULL---------------------
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
