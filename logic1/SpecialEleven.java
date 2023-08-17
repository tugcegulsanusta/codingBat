package logic1;

public class SpecialEleven {
    /*
    We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod


    specialEleven(22) → true
    specialEleven(23) → true
    specialEleven(24) → false
     */
    public boolean specialEleven(int n) {
        int div = n%11;
        if(div==0 || div==1)return true;
        return false;
    }

}
