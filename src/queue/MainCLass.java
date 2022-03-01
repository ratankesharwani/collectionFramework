package queue;

import java.util.PriorityQueue;

public class MainCLass {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        System.out.println(p.peek());
//        System.out.println(p.element());
        for(int i=0;i<=12;i++){
            p.offer(i);
        }
        System.out.println(p.peek());
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p.remove());
        System.out.println(p.remove(6));
        System.out.println(p);
        System.out.println(p.removeAll(p));
        System.out.println(p.poll());
        System.out.println(p);
    }
}
