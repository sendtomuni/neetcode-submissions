class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();

        for(String s : strs) {
            boolean flag = false;
            for (List<String> existing : anagrams) {
                String first_word = existing.get(0);
                if(this.checkAnagrams(first_word,s)) {
                    existing.add(s);
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                List<String> x = new ArrayList<>();
                x.add(s);
                anagrams.add(x);
            }
        }
        return anagrams;
    }

    public boolean checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        Map<Character, Integer> stringcount = new HashMap<>();
        for(char s: str1.toCharArray()) {
            if (stringcount.containsKey(s)) {
                stringcount.put(s, stringcount.get(s) + 1);
                continue;
            }
            stringcount.put(s, 1);
        }

        for(char s: str2.toCharArray()) {
            if (stringcount.containsKey(s) && stringcount.get(s) > 0) {
                stringcount.put(s, stringcount.get(s) - 1);
                continue;
            }
            return false;
        }
        return true;
    }
}
