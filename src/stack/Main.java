package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack c =new Stack();
        c.push(8);
        c.push('f');
        c.push("d");
        System.out.println(c);
        System.out.println(c.search(8));
        System.out.println(c.search('j'));
        c.pop();
        System.out.println(c);
    }
}
