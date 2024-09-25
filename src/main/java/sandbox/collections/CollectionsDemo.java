package sandbox.collections;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        Set<String> set2 = new HashSet<>(); // SET means it does not allow duplicates
        Set<String> set3 = new TreeSet<>(); // TREESET maintains order and sorts the elements

        List<String> list = new ArrayList<>(); //how to declare and initialize a list

        Queue<String> queue = new LinkedList<>();
        Deque<String> deque = new LinkedList<>();

        Queue<String> priorityQueue = new PriorityQueue<>(); //sorts elements based on priority

        set2.add("hi");
        set2.add("howdy");
        set2.add("hi");
        set2.add("hello");
        set2.add("hi");
        set2.add("hola");
        set2.add("there"); // hashset does not maintain order

        System.out.println("set2: " + set2);

        set.add("hi");
        set.add("howdy");
        set.add("hi");
        set.add("hello");
        set.add("hi");
        set.add("hola");
        set.add("there"); // hashlinkedset maintains order (LINKED means it maintains order)

        System.out.println("set: " + set);

        set.remove("hi");
        System.out.println("set: " + set);

        set3.add("hi");
        set3.add("howdy");
        set3.add("hi");
        set3.add("hello");
        set3.add("hi");
        set3.add("there");
        set3.add("hola"); // treeset sorts by alphabetical order (natural order)

        System.out.println("set3: " + set3);



    }
}
