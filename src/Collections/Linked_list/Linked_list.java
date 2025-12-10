package Collections.Linked_list;

import java.util.LinkedList;

public class Linked_list {
    static void main(String[] args) {
        // To Fetch The Index Is Not Possible In The Linked_List.
        LinkedList<String> bikes=new LinkedList<>();
        bikes.add("R1M");
        bikes.add("Ducati");
        bikes.add("ZX 10R");
        bikes.add("S1000 RR");
        bikes.add("Z 900");

        System.out.println(bikes);
        System.out.println(bikes.size());
        System.out.println(bikes.get(2));
        System.out.println(bikes.set(3,"Triumph"));
        System.out.println(bikes);
        System.out.println(bikes.contains("Audi R8"));
        bikes.remove(1);
        System.out.println(bikes);
        System.out.println(bikes.isEmpty());
        System.out.println(bikes.peek()); // peek is used for fetch the Header or First element.
        System.out.println(bikes);
        System.out.println(bikes.poll()); // poll is used for remove the Header or First element.
        System.out.println(bikes);
        bikes.offer("KTM");// Add The Element At The Last.
        System.out.println(bikes);


    }
}
