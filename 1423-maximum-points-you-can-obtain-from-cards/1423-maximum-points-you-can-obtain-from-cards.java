class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        int total = 0;

        for(int i = 0; i < n; i++) {
            total += cardPoints[i];
        }

        int windowSize = n - k;
        int sum = 0;

        // First window
        for(int i = 0; i < windowSize; i++) {
            sum += cardPoints[i];
        }

        int minSum = sum;

        // Sliding window
        for(int i = windowSize; i < n; i++) {
            sum = sum - cardPoints[i - windowSize] + cardPoints[i];

            minSum = Math.min(minSum, sum);
        }

        return total - minSum;
    }
}