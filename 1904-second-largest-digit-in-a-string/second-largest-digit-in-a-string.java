class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set=new HashSet<>();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                set.add(ch - '0');
            }
        }
        if(set.size()<2) return -1;
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        return list.get(list.size()-2);
    }
}