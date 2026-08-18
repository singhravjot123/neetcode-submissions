class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer>mp=new HashMap<>();
      int ans[]=new int[2];
      for(int i=0;i<nums.length;i++){
        mp.put(nums[i],i);
      }  
      for(int i=0;i<nums.length;i++){
        int rem=target-nums[i];
        if(mp.containsKey(rem) && mp.get(rem) != i){
            ans[0]=i;
            ans[1]=mp.get(rem);
            break;
        }
      }
      return ans;
    }
}
