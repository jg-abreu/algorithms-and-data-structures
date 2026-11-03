class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        s_count = {}
        t_count = {}

        for i in range(len(s)):
            
            letter = s[i]

            if letter in s_count:

                count = s_count[letter]
                count += 1
                s_count[letter] = count
            else:
                s_count[letter] = 1

        for i in range(len(t)):
            
            letter = t[i]

            if letter in t_count:

                count = t_count[letter]
                count += 1
                t_count[letter] = count
            else:
                t_count[letter] = 1

        return s_count == t_count