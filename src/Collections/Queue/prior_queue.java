package Collections.Queue;

import java.util.PriorityQueue;

public class prior_queue {
    static void main(String[] args) {
        PriorityQueue<Integer> num=new PriorityQueue<>();
        // It Don't Have The Proper Order.
        num.offer(5);
        num.offer(15);
        num.offer(55);
        num.offer(51);

        System.out.println(num);
        System.out.println(num.peek());
        System.out.println(num.poll());
        System.out.println(num);
        num.offer(12);
        num.offer(12);
        System.out.println(num);



    }
}
