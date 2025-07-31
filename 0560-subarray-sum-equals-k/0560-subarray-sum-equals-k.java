class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int count = 0;
        int sum = 0;

        
        h.put(0, 1);

        for (int i : nums) {
            sum += i;

            if (h.containsKey(sum - k)) {
                count += h.get(sum - k);
            }

            h.put(sum, h.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
