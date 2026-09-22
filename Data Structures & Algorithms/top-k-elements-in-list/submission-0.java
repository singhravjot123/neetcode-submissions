class Solution {
    class Pair{
        int num;
        int freq;  
    Pair(int element,int freq){
        this.num=element;
        this.freq=freq;
    }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }

        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.freq-b.freq);

        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
             
             int el=entry.getKey();
             int f=entry.getValue();

             pq.offer(new Pair(el,f));
        
        if(pq.size()>k){
            pq.poll();
        }
        }
        int result[]=new int[k];
        for(int i=0;i<k;i++){
            result[i]=pq.poll().num;
        }
        return result;
    }
}
