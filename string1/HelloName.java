package string1;

public class HelloName {
    /*
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
     */
    public String helloName(String name) {
        String hello = "Hello ";
        return hello+name+"!";
    }

}
