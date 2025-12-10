package Collections.Stack;

import java.util.Stack;

public class stack {
    static void main(String[] args) {
        Stack<Integer> num=new Stack<>();
        // The Major Method For The Stack Is The Push(),Pop().
        num.push(2);
        num.push(7);
        num.push(48);
        num.push(254);

        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.capacity()); // It Used To Store The Maximum Elements.
         num.clear();

    }
}
