package warmUp1;

public class DelDel {
    /*

    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"
     */

    public String delDel(String str) {
        String sub= "del";
        if(str.length()>=4){
            if(sub.equals(str.substring(1,4))){
                String deleted=str.substring(0,1)+str.substring(4,str.length());
                return deleted;
            }return str;
        }return str;

    }

}
