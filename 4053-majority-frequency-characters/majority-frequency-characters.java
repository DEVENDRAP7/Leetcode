class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] charr=s.toCharArray();
        for(char c : charr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
         Map<Integer, List<Character>> groups = new HashMap<>();
        for (var entry : map.entrySet()) {
            int count = entry.getValue();
            groups.computeIfAbsent(count, k -> new ArrayList<>()).add(entry.getKey());
        }
        int bestSize = 0, bestK = 0;
        List<Character> bestGroup = new ArrayList<>();
        for (var entry : groups.entrySet()) {
            int k = entry.getKey();
            List<Character> chars = entry.getValue();
            int size = chars.size();
            if (size > bestSize || (size == bestSize && k > bestK)) {
                bestSize = size;
                bestK = k;
                bestGroup = chars;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : bestGroup) sb.append(ch);
        return sb.toString();
    }
}