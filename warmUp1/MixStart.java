package warmUp1;

public class MixStart {
    /*
    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false
     */
    public boolean mixStart(String str) {
        if(str.length()>=3){
            String mix = "ix";
            if(mix.equals(str.substring(1,3))){
                return true;
            }return false;
        }return false;
    }

}
