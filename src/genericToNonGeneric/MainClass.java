package genericToNonGeneric;

import java.util.ArrayList;

import static genericToNonGeneric.SecondClass.m1;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("sam");
        arrayList.add("naini");
        arrayList.add("uhjh");
//        arrayList.add(10);
        System.out.println(arrayList);
        m1(arrayList);
        System.out.println(arrayList);
//        arrayList.add(10);
    }
}
