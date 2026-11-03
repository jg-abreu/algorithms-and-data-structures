class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sCount = new HashMap<>();

        HashMap<Character, Integer> tCount = new HashMap<>();
        
        for (int i = 0; i < s.length(); i ++) {

            char letter = s.charAt(i);
            
            if (sCount.containsKey(letter)){
                int count = sCount.get(letter);
                count += 1;
                sCount.put(letter, count);
            } else {
                sCount.put(letter, 1);
            }
        }

        for (int i = 0; i < t.length(); i ++) {

            char letter = t.charAt(i);
            
            if (tCount.containsKey(letter)){
                int count = tCount.get(letter);
                count += 1;
                tCount.put(letter, count);
            } else {
                tCount.put(letter, 1);
            }
        }

        return sCount.equals(tCount);
    }
}