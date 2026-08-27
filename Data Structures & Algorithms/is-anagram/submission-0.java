class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        if(s.length() != t.length()) {
            return false;
        }

        s = s.toLowerCase();
        t = t.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
           map.put(c, map.getOrDefault(c,0)+1);
        }

        boolean result = true;
        for(char c : t.toCharArray()) {
            if(!map.containsKey(c)) {
                result = false;
                break;
            }
            if(map.get(c) > 1) {
                map.put(c, map.get(c)-1);
            } else {
                map.remove(c);
            }
        }
        
        if(!map.isEmpty()) {
            result = false;
        }
        
        return result;
    }
}
