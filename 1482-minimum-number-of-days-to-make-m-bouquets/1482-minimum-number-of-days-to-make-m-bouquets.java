class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int bloom : bloomDay) {
            low = Math.min(low, bloom);
            high = Math.max(high, bloom);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int bouquets = 0;
            int count = 0;

            for (int bloom : bloomDay) {
                if (bloom <= mid) {
                    count++;

                    if (count == k) {
                        bouquets++;
                        count = 0;
                    }
                } else {
                    count = 0;
                }
            }

            if (bouquets >= m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}