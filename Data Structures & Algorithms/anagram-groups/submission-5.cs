public class Solution {
    public List<List<string>> GroupAnagrams(string[] strs) {
    Dictionary< string , List<string>> groupedAng = new Dictionary<string , List<string>>();

    foreach(var s in strs){
        int[] count = new int[26];
        foreach(char c in s){
                count[ c - 'a']++;
            }
            string key =  string.Join( "," , count);

            if(!groupedAng.ContainsKey(key)){
                  groupedAng[key]= new List<string>();
                }
             groupedAng[key].Add(s);
    }

        return groupedAng.Values.ToList();
        
    }
}
