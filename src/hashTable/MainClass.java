package hashTable;

import java.util.Hashtable;

public class MainClass {
    public static void main(String[] args) {
        Hashtable h = new Hashtable(23);
        h.put(new Temp(5),"robert");
        h.put(new Temp(2),"sam");
        h.put(new Temp(6),"object");
        h.put(new Temp(15),"sam");
        h.put(new Temp(23),"sam");
        h.put(new Temp(16),"sam");
        //from top to bottom and from right to left;;;;;;
        System.out.println(h);
        System.out.println(h.size());
    }
}
