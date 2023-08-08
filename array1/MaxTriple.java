package array1;

public class MaxTriple {
    /*
    Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.


    maxTriple([1, 2, 3]) → 3
    maxTriple([1, 5, 3]) → 5
    maxTriple([5, 2, 3]) → 5
     */
    public int maxTriple(int[] nums) {
        int max= 0;
        int middle = nums.length/2;
        int end = nums.length-1;
        if(nums[0]>=nums[middle] && nums[0] >= nums[end]){
            max= nums[0];
        }if(nums[middle]>=nums[0] && nums[middle]>= nums[end]){
            max = nums[middle];
        }if(nums[end]>=nums[0] && nums[end] >= nums[middle]){
            max = nums[end];
        }return max;
    }

}
