package treeMap;
import java.util.TreeMap;
public class NavigableTreeMap {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("1","1000");
        treeMap.put("2","2000");
        treeMap.put("3","3000");
        treeMap.put("4","4000");
        treeMap.put("5","5000");
        System.out.println(treeMap);
        System.out.println(treeMap.ceilingKey("1"));
        System.out.println(treeMap.lowerEntry("2"));
        System.out.println(treeMap.floorKey("3"));
        System.out.println(treeMap.higherKey("4"));
        System.out.println(treeMap.pollLastEntry());
        System.out.println(treeMap.pollLastEntry());
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap);
    }
}
