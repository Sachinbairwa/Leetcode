import java.util.*;

class Solution {

    public List<Integer> intersection(int[][] nums) {

        // Step 1: Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 2: Count frequency in each array
        for (int[] arr : nums) {

            for (int num : arr) {

                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        // Step 3: Create result list
        List<Integer> result = new ArrayList<>();

        // Step 4: Find common elements
        for (int key : map.keySet()) {

            if (map.get(key) == nums.length) {
                result.add(key);
            }
        }

        // Step 5: Sort result
        Collections.sort(result);

        return result;
    }
}
