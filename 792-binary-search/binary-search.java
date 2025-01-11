class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }else{
                return -1;
            }
        }

        int left = 0;
        int right = nums.length-1;
       

        while(left <= right){
             int mid = (left + right)/2;
             if(target < nums[mid]){
                right = mid -1 ;
             }else if(target > nums[mid]){
                left = mid + 1 ;
             }else{
                return mid;
             }
        }

        return -1;
    }
}