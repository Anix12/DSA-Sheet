package Cognizant;

import java.util.*;

public class DistinctDogsQ23 {
    public static int dogBarks(String s) {
        String parts[] = s.split("\\.+");
        Set<String> barks = new HashSet<>();
        for (String key : parts) {
            if (!key.isEmpty()) {
                barks.add(key);
            }
        }
        return barks.size();
    }

    public static void main(String[] args) {
        String s = "B...B...BB...BBBBB...BBB";
        System.out.println(dogBarks(s));
    }
}
