package nonGenericToGeneric;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<String>();
        l.add(8);
        l.add(10.8);
        l.add(true);
        l.add("y");
        l.add('i');
        System.out.println(l);
    }
}
