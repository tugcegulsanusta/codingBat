package string1;

public class ConCat {
    /*
    Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"
     */
    public String conCat(String a, String b) {
        if(a.length() > 0 && b.length() > 0){
            if(a.substring(a.length()-1 , a.length()).equals(b.substring(0,1))){
                return a.substring(0,a.length()-1)+b.substring(0,b.length());
            }
        }return a.substring(0,a.length())+b.substring(0,b.length());
    }

}
