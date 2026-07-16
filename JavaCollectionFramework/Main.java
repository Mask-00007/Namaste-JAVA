package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // List or Collection -> Interface

        // ArrayList -> Concrete class
        ArrayList<Integer> list = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();

        // Applying common methods
        // add();
        list.add(10);
        list.add(200);
        list.add(100);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        // remove();
        list.remove(0);
        System.out.println(list);

        // addAll();
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);

        // Adding list2 into list
        list.addAll(list2);
        System.out.println("UPDATED LIST: " + list);
        list.removeAll(list2);
        System.out.println("Current list: " + list);

        // size();
        System.out.println(list.size());

        // iterator();
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // get();
        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(45);
        list3.add(13);
        list3.add(14);
        list3.add(15);
        System.out.println(list3.get(4));

        // set(); -> setting the value according to the index
        list3.set(3, 22);
        System.out.println(list3);

        // toArray();
        System.out.println(list3.toArray());
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // sort an array list
        Collections.sort(list3);
        System.out.println("Priniting list3 in ascending order: " + list3);
        Collections.sort(list3.reversed());
        System.out.println("Prinitng the list in descending order: " + list3);

        // clone(); returns shallow copy
        ArrayList<Integer> newList = new ArrayList<>(list3);
        System.out.println(newList);

        // LINEKD LIST;
        LinkedList<Integer> list4 = new LinkedList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();

        // Applying common methods
        // add();
        list4.add(10);
        list4.add(200);
        list4.add(100);
        System.out.println(list4);
        list4.add(40);
        System.out.println(list4);

        // Direct cloning is not allowed in linked list, we have to create a new linked
        // list then we have to copy the respective nodes one by one...

        // addFirst() and addLast();
        list4.addFirst(23232);
        list4.addLast(32323);
        System.out.println("Updated list4 will be: " + list4);

        // peek();
        System.out.println(list4.peek());
        System.out.println(list4);

        // poll();
        System.out.println(list4.poll());
        System.out.println(list4);

        // STACK;
        Stack<Integer> stacks = new Stack<>();
        stacks.add(222);
        stacks.add(221);
        stacks.add(220);
        stacks.add(226);
        System.out.println(stacks);
        System.out.println(stacks.pop());

        // Stack Methods : push, pop, peek, search, empty;

    }

}
