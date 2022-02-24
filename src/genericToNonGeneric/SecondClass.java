package genericToNonGeneric;

import java.util.ArrayList;

public class SecondClass {
    public static void m1(ArrayList arrayList){
        arrayList.add(10);
        arrayList.add(10.3);
        arrayList.add(true);
        arrayList.add('r');
        arrayList.add(5f);
    }
}
