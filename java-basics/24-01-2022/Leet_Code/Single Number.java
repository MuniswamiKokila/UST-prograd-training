class Solution {
    public int singleNumber(int[] nums) {
        
    int len = nums.length;
   
    Arrays.sort(nums);
    int i=0;
    while (i<len-1) {
        if (nums[i] != nums[i+1]) {
            return nums[i];
        }
      i += 2;
    }
   //check for last element
   if (len % 2 == 1) {
      return nums[len-1];
   }
   return -1;
    }
}