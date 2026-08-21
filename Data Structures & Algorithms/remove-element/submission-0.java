class Solution {
    public int removeElement(int[] nums, int val) {
       int i=0;
       int j=0;
       int n=nums.length;
       while(j<n){
        if(nums[j]!=val){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j++;
        }
        else{
            j++;
        }
       }
       int k=0;
       while(k<n&&nums[k]!=val){
            k++;
          }
          return k;
    }
}