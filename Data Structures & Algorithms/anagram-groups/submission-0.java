class Solution {
    public List<List<String>> groupAnagrams(String[] l1) {
        Map<String,List<String>> m=new HashMap<>();
        for(String ch:l1){
            char [] l2=ch.toCharArray();
            Arrays.sort(l2);
            String s1=new String(l2);
            if(!m.containsKey(s1)) m.put(s1,new ArrayList<>());
            m.get(s1).add(ch);
        }
        return new ArrayList<>(m.values());
    }
}
