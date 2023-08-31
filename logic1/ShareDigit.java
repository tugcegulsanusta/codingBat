package logic1;

public class ShareDigit {
    /*
    Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)


    shareDigit(12, 23) → true
    shareDigit(12, 43) → false
    shareDigit(12, 44) → false
     */
    public boolean shareDigit(int a, int b) {
        int lefta= a/10;
        int righta =a%10;
        int leftb= b/10;
        int rightb = b%10;
        if(lefta == leftb || lefta == rightb ||
                righta == leftb || righta ==rightb)return true;
        return false;
    }
}
