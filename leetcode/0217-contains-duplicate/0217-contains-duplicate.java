class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSeen = new HashSet<>();

        for (int num : nums) {
            if (!(numSeen.contains(num))) {
                numSeen.add(num);
            } else {
                return true;
            }
        }
        return false;
    }
}