
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = 0;

        for (int num : nums) {
            end = Math.max(end, num);
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;

            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }

            if (sum <= threshold) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
