class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> brackEq  = new HashMap<Character, Character>();

        brackEq.put('[', ']');
        brackEq.put('(', ')');
        brackEq.put('{', '}');

    Stack<Character> stck = new Stack<Character>();

     for(char c : s.toCharArray() ){
            if( brackEq.containsKey(c)){
                stck.push(c);
            }
            else if (!stck.isEmpty() && brackEq.get(stck.peek()) == c ){
                stck.pop();
            }
            else {
                return false;
            }
     }
     
return stck.isEmpty();
    }
}
