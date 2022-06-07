//Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
//
//
//        endUp("Hello") → "HeLLO"
//        endUp("hi there") → "hi thERE"
//        endUp("hi") → "HI"

public class EndUp {

    private String str;

    public EndUp(String str) {
        this.str = str;
    }

    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        String last3 = str.substring(str.length()-3,str.length());
        String front = str.substring(0,str.length()-3);
        return front + last3.toUpperCase();
    }
}
