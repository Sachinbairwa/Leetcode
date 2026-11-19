
import java.util.*;

class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        // Step 1: Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 2: Count frequency of nums1
        for (int num : nums1) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 3: Create ArrayList for result
        ArrayList<Integer> result = new ArrayList<>();

        // Step 4: Find common elements
        for (int num : nums2) {

            if (map.getOrDefault(num, 0) > 0) {

                result.add(num);

                // Decrease frequency
                map.put(num, map.get(num) - 1);
            }
        }

        // Step 5: Convert ArrayList to int array
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {

            ans[i] = result.get(i);
        }

        // Step 6: Return answer
        return ans;
    }
}
