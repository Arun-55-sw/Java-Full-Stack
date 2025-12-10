package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    static void main(String[] args) {
        // This Method Is Unordered.
        Set<Integer> a=new HashSet<>();
        a.add(12);
        a.add(154);
        a.add(121);
        a.add(1201);
        a.add(1212);

        System.out.println(a);
       System.out.println(a.size());
        a.remove(12);
        System.out.println(a);
        System.out.println(a.contains(121));
        System.out.println(a.hashCode());


    }
}
