package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
    static void main(String[] args) {
        //It will Take In Ascending Order.
        TreeSet<Integer> b=new TreeSet<>();
        b.add(10);
        b.add(11);
        b.add(14);
        b.add(104);

        System.out.println(b);
        System.out.println(b.size());
        b.add(5);
        b.add(13);
        b.add(1);
        b.add(12);
        System.out.println(b);
        // The Below methods Only Work In TreeSet Method.

        System.out.println(b.first());// It Is Used To Fetch The 'Smallest' Element.
        System.out.println(b.last()); // It Is Used To Fetch The 'Largest' Element.
        System.out.println(b.ceiling(12)); //It Will Fetch All The Elements 'Greater Than Or Equal To' What Number You Give.
        System.out.println(b.floor(10)); //It Will Fetch The Elements 'Lesser Than Or Equal To' What Number You Give.
        System.out.println(b.higher(10)); // It Will Fetch The 'Greater' Than The Given Element.
        System.out.println(b.lower(5)); // It Will Fetch The 'Lower' Than The Given Element.
    }
}
