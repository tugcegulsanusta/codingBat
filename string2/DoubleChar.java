package string2;

public class DoubleChar {
    /*
    Given a string, return a string where for every char in the original, there are two chars.


    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public String doubleChar(String str) {
        String end = "";
        int start = 0;
        for(int i = 1 ; i<=str.length(); i++){
            end+= str.substring(start,i) + str.substring(start,i);
            start ++;
        }return end;
    }
}
