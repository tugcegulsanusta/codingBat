package warmUp1;

public class Front3 {
    /*
    Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


    front3("Java") → "JavJavJav"
    front3("Chocolate") → "ChoChoCho"
    front3("abc") → "abcabcabc"
     */
    public String front3(String str) {
        String newone;
        if(str.length()<=3){
            newone = str+str+str;
            return newone;
        }else{
            String front = str.substring(0,3);
            newone = front + front +front;
            return newone;
        }
    }

}
