package Collections.Arr_Deque;

import java.util.ArrayDeque;

public class arr_deque {
    static void main(String[] args) {
        ArrayDeque<Integer> abc=new ArrayDeque<>();
        // Same As It Priority_Queue But We Use Push And Pop Method.
        // It Maintains only Insertion Proper Order.
        abc.add(12);
        abc.add(124);
        abc.add(221);
        abc.add(142);
        abc.add(45);

        System.out.println(abc.size());
        System.out.println(abc);
        abc.push(13);
        System.out.println(abc);
        abc.pop();
        System.out.println(abc);
        abc.addFirst(10);
        System.out.println(abc);
        abc.addLast(550);
        System.out.println(abc);
        abc.remove(221);
        System.out.println(abc);
        System.out.println(abc.reversed());
        System.out.println(abc);
        System.out.println(abc.peek());
        System.out.println(abc.poll());


    }
}
