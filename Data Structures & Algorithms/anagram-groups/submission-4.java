class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
            int freq[]=new int[26];
            for(char ch:s.toCharArray()){
                freq[ch-'a']++;
            }
            String t=Arrays.toString(freq);
            if(mp.containsKey(t)){
                mp.get(t).add(s);
            }
            else{
                List<String> lt=new ArrayList<>();
                lt.add(s);
                mp.put(t,lt);
            }
        }
        return new ArrayList<>(mp.values());
    }
}
