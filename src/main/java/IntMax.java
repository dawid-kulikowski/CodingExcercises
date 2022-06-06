//
//Given three int values, a b c, return the largest.
//
//
//        intMax(1, 2, 3) → 3
//        intMax(1, 3, 2) → 3
//        intMax(3, 2, 1) → 3

public class IntMax {
    public IntMax(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int a;
    private int b;
    private int c;

    public int intMax(int a, int b, int c) {
        if (a>b && a>c) {
            return a;
        } else if (b>a && b>c) {
            return b;
        } else {
            return c;
        }
    }



}
