package warmUp1;

public class FrontBack {
    /*
    Given a string, return a new string where the first and last chars have been exchanged.


    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */
    public String frontBack(String str) {
        String newstr;
        if(str.length()>1){
            String front = str.substring(0,1);
            String back = str.substring(str.length()-1, str.length());
            String middle = str.substring(1,str.length()-1);
            newstr = back+middle+front;
            return newstr;
        }return str;
    }

}
