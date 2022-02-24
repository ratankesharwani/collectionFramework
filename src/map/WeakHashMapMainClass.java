package map;

import java.util.LinkedHashMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadLocalRandom;

public class WeakHashMapMainClass {
    public static void main(String[] args) {
        WeakHashMap m = new WeakHashMap();
        TempClass t = new TempClass();
        m.put(t,"9");
        System.out.println(m);
        t = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(m);
    }
}
