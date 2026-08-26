class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set s = new HashSet();
        boolean result = false;
        for (int i : nums) {
            if(!s.add(i)) {
                result = true;
            }
        }
        return result;
    }
}