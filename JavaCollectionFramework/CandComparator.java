package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CandComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(8);
        list.add(2);
        list.add(19);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        List<studentCandComparator> list1 = new ArrayList<>();
        list1.add(new studentCandComparator(19, "Vipul", 68));
        list1.add(new studentCandComparator(17, "Bipul", 60));
        list1.add(new studentCandComparator(35, "Omveer", 52));
        list1.add(new studentCandComparator(35, "Vikrant", 72));
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println("Updated list: " + list1);

        // Using Comparator
        Collections.sort(list1, new Comparator<studentCandComparator>() {
            @Override
            public int compare(studentCandComparator o1, studentCandComparator o2) {
                return Integer.compare(o1.weight, o2.weight);
            }
        });

    }

}