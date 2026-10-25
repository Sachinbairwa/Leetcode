class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int total = nums1.length + nums2.length;

        int low = 0;
        int high = nums1.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int mid2 = (total + 1) / 2 - mid;

            int left1 = (mid == 0) ? Integer.MIN_VALUE : nums1[mid - 1];
            int right1 = (mid == nums1.length) ? Integer.MAX_VALUE : nums1[mid];

            int left2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int right2 = (mid2 == nums2.length) ? Integer.MAX_VALUE : nums2[mid2];

            if (left1 <= right2 && left2 <= right1) {

                if (total % 2 == 0) {
                    return (Math.max(left1, left2)
                          + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }

            } else if (left1 > right2) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return 0.0;
    }
}