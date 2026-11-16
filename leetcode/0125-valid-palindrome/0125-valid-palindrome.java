class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            char esq = s.charAt(l);
            char dir = s.charAt(r);
            if (!(Character.isLetterOrDigit(esq))) {
                l++;
                continue;
            }
            if (!(Character.isLetterOrDigit(dir))) {
                r--;
                continue;
            }
            if (Character.toLowerCase(esq) != Character.toLowerCase(dir)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
