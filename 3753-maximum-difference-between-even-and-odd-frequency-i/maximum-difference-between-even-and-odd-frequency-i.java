class Solution {
    public int maxDifference(String s) {
        int arr[]=new int[26];

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            arr[idx]++;
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 1) {
                    maxOdd = Math.max(maxOdd, arr[i]);
                } else {
                    minEven = Math.min(minEven, arr[i]);
                }
            }
        }
        return maxOdd - minEven;
    }
}