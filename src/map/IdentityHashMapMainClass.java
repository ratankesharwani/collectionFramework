package map;
import java.util.IdentityHashMap;
public class IdentityHashMapMainClass {
    public static void main(String[] args) {
        IdentityHashMap m = new IdentityHashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        m.put(i1,"9");
        m.put(i2,"8");
        System.out.println(m);
    }
}
