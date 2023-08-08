package array1;

public class MidThree {
    /*
    Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.


    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    midThree([1, 2, 3]) → [1, 2, 3]
     */
    public int[] midThree(int[] nums) {
        int[] arr= new int[3];
        int middle = nums.length/2;
        arr[0] = nums[middle-1];
        arr[1] = nums[middle];
        arr[2] = nums[middle+1];
        return arr;

    }

}
