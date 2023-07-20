package string1;

public class LastTwo {
    /*
    Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


    lastTwo("coding") → "codign"
    lastTwo("cat") → "cta"
    lastTwo("ab") → "ba"
     */
    public String lastTwo(String str) {
        if(str.length()>=2){
            String end = str.substring(str.length()-1,str.length());
            String beforend= str.substring(str.length()-2,str.length()-1);
            return str.substring(0,str.length()-2)+end+beforend;
        }return str;
    }

}
