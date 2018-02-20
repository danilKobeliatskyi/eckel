package danil.chapter11;

import java.util.*;

public class Statistics {
    private static int getBestInt20(int n) {
        Random rand = new Random();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }
        int max = 0;
        for(int i = 0; i < map.keySet().size(); i++) {
            max = max < map.get(i) ? map.get(i) : max;
        }
        Set<Map.Entry<Integer,Integer>> mapEntry = new LinkedHashSet<Map.Entry<Integer,Integer>>(map.entrySet());
        int maxKey = 0;
        Iterator<Map.Entry<Integer,Integer>> iterator = mapEntry.iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer,Integer> findMax = iterator.next();
            if(findMax.getValue() == max)
                maxKey = findMax.getKey();
        }
        return maxKey;
    }
    Statistics() {
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int i = 0; i < 2000; i++) {
            int x = getBestInt20(10000);
            Integer freq = map.get(x);
            map.put(x, freq == null ? 1 : freq + 1);
        }
        System.out.println("Most often picked ints is: " + map);
    }
}
