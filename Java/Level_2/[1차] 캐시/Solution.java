import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        List<String> cache = new ArrayList<String>();
        List<Integer> time = new ArrayList<Integer>();
        
        for(int i = 0; i < cities.length; i++) {
            if(cache.contains(cities[i].toLowerCase())) {
                answer += 1;
                for(int j = 0; j < time.size(); j++) {
                    time.set(j, time.get(j) + 1);
                }
                time.set(cache.indexOf(cities[i].toLowerCase()), 1);
            } else {
                answer += 5;
                if(cache.size() == cacheSize && cacheSize != 0) {
                    int lru = time.get(0); int index = 0;
                    for(int j = 0; j < time.size(); j++) {
                        if(lru < time.get(j)) { lru = time.get(j); index = j; }
                    }
                    
                    cache.set(index, cities[i].toLowerCase());
                    
                    for(int j = 0; j < time.size(); j++) {
                        time.set(j, time.get(j) + 1);
                    }
                    time.set(index, 1);
                } else if(cache.size() < cacheSize) { 
                    cache.add(cities[i].toLowerCase());
                    for(int j = 0; j < time.size(); j++) {
                        time.set(j, time.get(j) + 1);
                    }
                    time.add(1);
                }
            }
        }
        
        return answer;
        
    }
}