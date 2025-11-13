class Solution {
    public int maxProduct(int[] nums) {
        int pre = 1,suff =1;
        int pro = nums[0];
        int size = nums.length;
        for(int i=0;i<size;i++){
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;

            pre *= nums[i];
            suff *= nums[size-i-1];

            pro = Math.max(pro,Math.max(pre,suff));
        }
        return pro;
    }
}