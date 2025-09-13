class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> hash= new HashMap<>();
        for(char ch:s.toCharArray()){
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }
        int v=0,c=0;
        for(Map.Entry<Character,Integer> entry : hash.entrySet()){
            char ch= entry.getKey();
            int count = entry.getValue();
            if("aeiou".indexOf(ch)>=0)
                v=Math.max(v,count);
            else
                c=Math.max(c,count);
        }
        return c+v;
    }
}