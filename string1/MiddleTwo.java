package string1;

public class MiddleTwo {
    /*
    Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.


    middleTwo("string") → "ri"
    middleTwo("code") → "od"
    middleTwo("Practice") → "ct"
     */
    public String middleTwo(String str) {
        int num = str.length()/2;
        return str.substring(num-1,num+1);
    }

}
