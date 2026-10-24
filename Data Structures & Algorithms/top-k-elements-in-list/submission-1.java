class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i : nums) {
            count.putIfAbsent(i, 0);
            int updatedCount = count.get(i) + 1;
            count.put(i, updatedCount);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}
