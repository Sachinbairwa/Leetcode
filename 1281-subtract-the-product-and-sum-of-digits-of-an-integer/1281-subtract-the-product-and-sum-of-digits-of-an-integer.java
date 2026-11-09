class Solution {
    public int subtractProductAndSum(int n) {
        return String.valueOf(n).chars().map(c -> c - '0').reduce(1, (a, b) -> a * b) - String.valueOf(n).chars().map(c -> c - '0').sum();
    }
}