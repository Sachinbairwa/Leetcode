class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;

        // First window
        for(int i = 0; i < k; i++) {
            if("aeiou".indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }

        max = count;

        // Slide the window
        for(int i = k; i < s.length(); i++) {

            // Add new character
            if("aeiou".indexOf(s.charAt(i)) != -1) {
                count++;
            }

            // Remove old character
            if("aeiou".indexOf(s.charAt(i - k)) != -1) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}