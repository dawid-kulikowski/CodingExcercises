//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
//
//
//        makes10(9, 10) → true
//        makes10(9, 9) → false
//        makes10(1, 9) → true


public class Makes10 {
    public Makes10(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int a;
    private int b;

    public boolean makes10(int a, int b) {
        if (a+b==10)  {
            return true;
        }
        else return (a == 10) || (b == 10);

    }



}
