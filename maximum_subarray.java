class Solution {
    public int maxSubArray(int[] nums) {
       
       int add=0;
       int max=nums[0];
       int n =nums.length;
        for(int i=0;i<n;i++){
            add+=nums[i];
            max = Math.max(max,add);
            if(add<0){
                add=0;
            }
        }
        return max;
    }
}