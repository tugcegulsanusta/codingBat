package array1;

public class Reverse3 {
    /*
    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7]
     */
    public int[] reverse3(int[] nums) {
        int[] arr = new int[3];
        arr[0] = nums[2];
        arr[1] = nums[1];
        arr[2] = nums[0];
        return arr;
    }
}
