class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> remainings = new HashMap<>(); 

        for (int i=0; i<nums.length; i++) {
            if(remainings.containsKey(nums[i])) {
                return new int[]{remainings.get(nums[i]), i};
            } else {
                remainings.put(target - nums[i], i);
            }
        }
        return null;    
    }
}
