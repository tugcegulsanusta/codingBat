package string1;

public class AtFirst {
    /*
    Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.


    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"
     */
    public String atFirst(String str) {

        String at = "";
        if(str.length()>=2){
            return str.substring(0,2);
        }
        if(str.length()==0){
            return "@@";
        }
        if(str.length()<2 && str.length()>0){
            for(int i= 0; i<str.length() ;i++){
                at += "@";
            }
        }return str.substring(0,str.length())+at;

    }
}
