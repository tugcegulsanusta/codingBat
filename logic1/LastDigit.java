package logic1;

public class LastDigit {
    /*
    Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


    lastDigit(23, 19, 13) → true
    lastDigit(23, 19, 12) → false
    lastDigit(23, 19, 3) → true
     */
    public boolean lastDigit(int a, int b, int c) {
        int moda = a%10;
        int modb = b%10;
        int modc = c%10;
        if(moda==modc || moda == modb || modb== modc)return true;
        return false;
    }
}
