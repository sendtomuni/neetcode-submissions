class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int[] result = new int[k];
        int remainingCount = k-1;

        for(int i : nums) {
            count.putIfAbsent(i, 0);
            int updatedCount = count.get(i) + 1;
            count.put(i, updatedCount);
        }

        List<Integer>[] bucket = new List[nums.length+1];

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if(bucket[entry.getValue()] ==  null) bucket[entry.getValue()] = new ArrayList<>();
            bucket[entry.getValue()].add(entry.getKey());
        }

        int idx = 0;
        for (int j = bucket.length-1; j > 0 && idx < k; j--) {
            if (bucket[j] == null) continue;
            for (int item : bucket[j]) {
                result[idx] = item;
                idx++;
                if (idx == k) break;
            }
        }

        return result;
    }
}