package collections.sort;
import java.util.Comparator;

    public class MyConparator implements Comparator {
        public int compare(Object o1, Object o2) {
            String I1 = o1.toString();
            String I2 = o2.toString();
//        if(I1<I2){
//            return +1;
//        }
//        else if(I2<I1){
//            return -1;
//        }
//        else
//        return 0;
            //OR we can do;
            return -I1.compareTo(I2);
            //Or we can do ;
//        return I2.compareTo(I1);
            //or we can
            //  return 0; //insertion order must be preserved
        }
    }


