import java.util.HashSet;
class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        // Step 1: Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // Step 2: Store nums1 elements
        for (int num : nums1) {
            set.add(num);
        }

        // Step 3: Create result HashSet
        HashSet<Integer> result = new HashSet<>();

        // Step 4: Find common elements
        for (int num : nums2) {

            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Step 5: Convert HashSet to int array
        int[] ans = new int[result.size()];

        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}
