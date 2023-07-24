package string1;

public class WithoutX2 {
    /*
    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
     */
    public String withoutX2(String str) {
        int len = str.length();
        String x = "x";
        if(len>=2){
            if(str.substring(0,2).equals("xx"))return str.substring(2,len);
            if(str.substring(0,1).equals(x))return str.substring(1,len);
            if(str.substring(1,2).equals(x))return str.substring(0,1)+str.substring(2,len);
        }
        if(len == 1 && str.equals(x)){
            return "";
        }return str;
    }

}
