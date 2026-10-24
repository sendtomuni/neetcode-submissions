class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            anagrams.putIfAbsent(Arrays.toString(chars), new ArrayList<>());
            anagrams.get(Arrays.toString(chars)).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}
