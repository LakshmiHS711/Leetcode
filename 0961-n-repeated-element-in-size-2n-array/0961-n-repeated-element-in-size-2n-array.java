import java.util.HashSet;

class Solution {
    public int repeatedNTimes(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            // If already seen, this is the answer
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return -1; // As per constraints, this line is never reached
    }
}