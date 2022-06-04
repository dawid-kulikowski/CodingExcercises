//
//Given a string, return true if the string starts with "hi" and false otherwise.
//
//
//        startHi("hi there") → true
//        startHi("hi") → true
//        startHi("hello hi") → false



public class StartHi {
    String str;

    public StartHi(String str) {
        this.str = str;
    }


    public boolean startHi(String str) {
        if (str.length()<2) {
            return false;
        } else {
            String start = str.substring(0,2);
            return start.contains ("hi");
        }
    }
}
