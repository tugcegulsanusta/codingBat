package array1;

public class Double23 {
    /*
    Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.


    double23([2, 2]) → true
    double23([3, 3]) → true
    double23([2, 3]) → false
     */
    public boolean double23(int[] nums) {
        int count2 = 0;
        int count3 = 0;
        int len= nums.length;
        if(len>=2){
            for(int i=0;i<len;i++){
                if(nums[i] == 2){
                    count2 ++;
                }if(nums[i]==3){
                    count3++;
                }
            }return count2>=2 || count3>=2;
        }return false;
    }
}
