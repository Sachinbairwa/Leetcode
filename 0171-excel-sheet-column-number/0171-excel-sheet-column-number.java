class Solution {
    public int titleToNumber(String columnTitle) {
        return columnTitle.chars().reduce(0, (result, c) -> result * 26 + (c - 'A' + 1));
    }
}