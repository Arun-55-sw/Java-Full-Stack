package Collections.Set;

import java.util.LinkedHashSet;

public class Linked_Hash_Set {
    static void main(String[] args) {
        LinkedHashSet<Integer> m=new LinkedHashSet<>();
        m.add(12);
        m.add(154);
        m.add(121);
        m.add(1201);
        m.add(1212);

        System.out.println(m);
        System.out.println(m.size());
        m.remove(12);
        System.out.println(m);
        System.out.println(m.contains(121));
        System.out.println(m.hashCode());
        System.out.println(m.getFirst());

    }
}
