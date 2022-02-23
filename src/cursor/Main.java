package cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        Vector<Integer> v1 = new Vector<Integer>();

        for(int i=0;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());
        Enumeration<Integer> e = v.elements();
            while(e.hasMoreElements()){
        Integer i = e.nextElement();
        if(i%2==0){v1.addElement(i);}
        else{
            System.out.println(i+":"+"will be removed");
            v.remove(i);}}
            System.out.println(v1);
            System.out.println(v);
    }}
