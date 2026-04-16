public class Solution {
    public bool IsValid(string s) {
        Stack<char> openingStack = new Stack<char>();

        foreach(char c in s){

            if( c == '(' || c == '{' || c == '[')
            {
                    openingStack.Push(c);
            }
            else if (c == ')' || c == '}' || c == ']')
            {
                    if (openingStack.Count == 0) return false;
                    char open = openingStack.Pop();
                    if (open == '(' && c != ')')
                            return false;
                    if (open == '{' && c != '}')
                            return false;
                    if (open == '[' && c != ']')
                            return false;
        

            }
        }
        
        return openingStack.Count == 0;
            return true;

    }
}
