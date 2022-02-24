package map;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("ratan","9");
        m.put("sam","8");
        m.put("sam","9");
        m.put("ijk","8");
        m.put("jiu","8");
        m.put("jgj","8");
        System.out.println(m);
        Set s = m.keySet();
        System.out.println(s);
        Collection c = m.values();
        System.out.println(c);
        Set s2= m.entrySet();
        System.out.println(s2);
        Iterator itr = s2.iterator();
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry) itr.next();
//            System.out.println(m1.getKey()+":"+m1.getClass()+":"+m1.getValue());
            if(m1.getKey().equals("sam")){
                m1.setValue(12);
            }
            System.out.println(m1);
        }

    }
}
