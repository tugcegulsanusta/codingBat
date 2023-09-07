package logic2;

public class CloseFar {
    /*
    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.


    closeFar(1, 2, 10) → true
    closeFar(1, 2, 3) → false
    closeFar(4, 1, 3) → true
     */
    public boolean closeFar(int a, int b, int c) {
        int result1 = a-b;
        int result2 = a-c;
        int result3 = b-c;
        if(Math.abs(result1)<2 && Math.abs(result2)>=2 && Math.abs(result3)>=2 ||
                Math.abs(result2)<2 && Math.abs(result1)>=2 && Math.abs(result3)>=2){
            return true;

        }return false;
    }
}
