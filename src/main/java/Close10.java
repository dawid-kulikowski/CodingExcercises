//Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
//
//
//        close10(8, 13) → 8
//        close10(13, 8) → 8
//        close10(13, 7) → 0

public class Close10 {
    private int a;
    private int b;

    public Close10(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int close10(int a, int b) {
        int aClose10 = Math.abs(a-10);
        int bClose10 = Math.abs(b-10);
        if (aClose10<bClose10){
            return a;
        } else if (aClose10>bClose10) {
            return b;
        }
        else {
            return 0;
        }
    }

}
