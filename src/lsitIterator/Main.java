package lsitIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        ArrayList ll = new ArrayList();

        for(int i=0;i<=10;i++){l.add(i);}
        ListIterator itr = l.listIterator();
        while (itr.hasNext()){
            Integer i = (Integer) itr.next();
            if(i%2==0){System.out.println(i);
                ll.add(i);
            }
            else{itr.remove();
            }}System.out.println(l);
        System.out.println(ll);}
}
