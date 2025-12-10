package Collections.Array_List;

import java.util.ArrayList;
import java.util.List;

public class arr_list {
    static void main(String[] args) {
        List<String> cars=new ArrayList<>();
        cars.add("Audi R8");
        cars.add("BMW M8 Competition");
        cars.add("Porsche");
        cars.add("Dodge Challenger");
        System.out.println("The Given Array List Is : "+"\n"+cars);
        System.out.println(cars.indexOf("Audi R8"));
        System.out.println(cars.size());
        System.out.println(cars.get(2));
        System.out.println(cars.set(3,"Ferrari"));
        System.out.println(cars);
        System.out.println(cars.contains("Audi R8"));
        cars.remove(0);
        System.out.println(cars);
        System.out.println(cars.isEmpty());


    }
}
