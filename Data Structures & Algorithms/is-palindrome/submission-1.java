class Solution {
    public boolean isPalindrome(String s) {

        List<String> chars= new ArrayList<>();

        for(char c: s.toCharArray()){
            String charStr = String.valueOf(c).toLowerCase();

            if(charStr.matches("[a-z0-9]")) {
                chars.add(charStr);
            }
        }
        
        int len = chars.size();
        int n = len / 2;

        for(int i=0; i<n; i++){

            if(!chars.get(i).equals(chars.get(len-i-1))){
                return false;
            }

        }

        return true;
 
    }
}
