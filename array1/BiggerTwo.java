package array1;

public class BiggerTwo {
    /*
    Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.


    biggerTwo([1, 2], [3, 4]) → [3, 4]
    biggerTwo([3, 4], [1, 2]) → [3, 4]
    biggerTwo([1, 1], [1, 2]) → [1, 2]
     */
    public int[] biggerTwo(int[] a, int[] b) {
        int[] arr = new int[2];
        arr [0] = a[0] + a[1];
        arr [1] = b[0] + b[1];
        if(arr[0]>=arr[1]){
            return a;
        }return b;
    }

}
