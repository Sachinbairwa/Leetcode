/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
/**
 * // This is the MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        // 1. Find peak index
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        int peak = low;

        // 2. Search ascending half
        low = 0;
        high = peak;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = mountainArr.get(mid);

            if (value == target) {
                return mid;
            } else if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // 3. Search descending half
        low = peak + 1;
        high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = mountainArr.get(mid);

            if (value == target) {
                return mid;
            } else if (value > target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}