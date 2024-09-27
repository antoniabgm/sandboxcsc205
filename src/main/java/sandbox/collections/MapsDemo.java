package sandbox.collections;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one"); // key value pair
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");

        System.out.println("map: " + map);

    }
}
