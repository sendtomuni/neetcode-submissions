class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        Map<String, List<String>> checkAnagrams = new HashMap<>();

        for(String s : strs) {
            String key = counter(s);
            checkAnagrams.putIfAbsent(key, new ArrayList<>());
            checkAnagrams.get(key).add(s);
        }

        anagrams = new ArrayList<>(checkAnagrams.values());
        return anagrams;
    }

    public String counter(String S) {
        int constant = 97;
        int[] counter = new int[26];
        char[] character = S.toLowerCase().toCharArray();
        for (char c : character) {
            int index = (int) c - constant;
            counter[index] += 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int n : counter) sb.append(n).append('#');
        return sb.toString();
    }
}