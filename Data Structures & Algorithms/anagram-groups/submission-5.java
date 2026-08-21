class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>mp=new HashMap<>();
        for(String s:strs){
            int freq[]=new int[26];
            for(char ch:s.toCharArray()){
                freq[ch-'a']++;
            }
            String t=Arrays.toString(freq);
            if(!mp.containsKey(t)){
                List<String>lt=new ArrayList<>();
                lt.add(s);
                mp.put(t,lt);
            }
            else{
                mp.get(t).add(s);
            }
        }
        return new ArrayList<>(mp.values());
    }
}
