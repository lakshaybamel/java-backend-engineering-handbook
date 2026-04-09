import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        // LIST (ArrayList)
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(1); // duplicate allowed

        System.out.println("List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        System.out.println();

        // SET (HashSet)
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(1); // duplicate ignored

        System.out.println("Set: " + set);

        System.out.println();

        // MAP (HashMap)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(1, "C"); // key replaced

        System.out.println("Map: " + map);

        System.out.println();

        // ITERATION
        System.out.println("Iterating List:");
        for (int num : list) {
            System.out.println(num);
        }

        System.out.println();

        System.out.println("Iterating Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
 
        // COMPARATOR (Custom Sort)
        List<Integer> customList = new ArrayList<>();
        customList.add(5);
        customList.add(2);
        customList.add(8);

        Collections.sort(customList, (a, b) -> b - a); // descending
        System.out.println("Custom Sorted (Desc): " + customList);
    }
}