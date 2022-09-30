package mergeNames;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2){
        Set<String> strings = new HashSet<>();
        strings.addAll(Arrays.asList(names1));
        strings.addAll(Arrays.asList(names2));
        String[] arr = new String[strings.size()];
        int i = 0;
        for (String str : strings)
            arr[i++] = str;
        return arr;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
