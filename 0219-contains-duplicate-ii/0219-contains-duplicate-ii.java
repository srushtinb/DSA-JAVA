class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> win = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!win.add(nums[i])) {
                return true;
            }

            if (win.size() > k) {
                win.remove(nums[i - k]);
            }

        }
        return false;
    }
}