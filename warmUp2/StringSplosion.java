package warmUp2;

public class StringSplosion {
    /*
    Given a non-empty string like "Code" return a string like "CCoCodCode".


    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
     */
    public String stringSplosion(String str) {
        String x= "";
        for(int i = 0 ; i<= str.length(); i++){
            x+=str.substring(0,i);
        }return x;
    }

}
