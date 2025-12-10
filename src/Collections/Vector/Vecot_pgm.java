package Collections.Vector;

import java.util.Vector;

public class Vecot_pgm {
    static void main(String[] args) {
        Vector<Integer> num =new Vector<>();
        num.add(90);
        num.add(341);
        num.add(3321);
        num.add(12145);

        System.out.println(num.isEmpty());
        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.get(2));
        System.out.println(num.set(1,3));
        System.out.println(num);
        System.out.println(num.contains(1));
        num.remove(1);
        System.out.println(num);
        System.out.println(num);

    }
}
