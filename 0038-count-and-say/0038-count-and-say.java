public class Solution {
    public String countAndSay(int n) {
        if (n <= 0) return "";
        String res = "1";
        
        for (int i = 1; i < n; i++) {
            res = getNext(res);
        }
        
        return res;
    }

    private String getNext(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        
        while (i < s.length()) {
            int count = 1;
            char currentDigit = s.charAt(i);
            
            // Count consecutive occurrences of the same digit
            while (i + 1 < s.length() && s.charAt(i + 1) == currentDigit) {
                count++;
                i++;
            }
            
            // Append the count followed by the digit itself
            sb.append(count).append(currentDigit);
            i++;
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countAndSay(4)); // Output: 1211
    }
}