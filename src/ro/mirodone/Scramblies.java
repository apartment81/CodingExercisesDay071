package ro.mirodone;

import java.util.HashMap;

public class Scramblies {

    public boolean scramble(String str1, String str2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch1 : str1.toCharArray()) {
            map.put(ch1, 1 + map.getOrDefault(ch1, 0));
        }

        for (char ch : str2.toCharArray()) {
            Integer count = map.getOrDefault(ch, 0);
            if (count == 0) return false;
            map.put(ch, --count);
        }
        return true;


    }

}
