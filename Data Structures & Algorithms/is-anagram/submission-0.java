class Solution {
    public boolean isAnagram(String s, String t) {
            Map<Character,Integer> charCount = new HashMap<>();

            for( char c: s.toCharArray()){
                if (charCount.containsKey(c)){
                    charCount.put(c, charCount.get(c) + 1);
                } else {
                    charCount.put(c, 1);
                }
            }

            for(char c: t.toCharArray()) {
                 if (charCount.containsKey(c)){
                    charCount.put(c, charCount.get(c) - 1);
                } else {
                    return false;
                }
            }

            for(Integer v: charCount.values()) {
                if(v != 0) {
                    return false;
                }
            }
            return true;
    }
}
