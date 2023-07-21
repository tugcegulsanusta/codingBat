package string1;

public class MinCat {
    /*
    Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


    minCat("Hello", "Hi") → "loHi"
    minCat("Hello", "java") → "ellojava"
    minCat("java", "Hello") → "javaello"
     */
    public String minCat(String a, String b) {
        int size = 0;
        if(a.length()<=b.length()){
            size= a.length();
            return a + b.substring(b.length()-size,b.length());
        }else{
            size = b.length();
            return a.substring(a.length()-size,a.length())+b;
        }
    }

}
