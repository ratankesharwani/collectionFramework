package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] i = {2,1,3,4,0,2,2,8};
        Arrays.sort(i);
        for(int i1 : i){
            System.out.print(i1+"  ");
        }
    }
}
