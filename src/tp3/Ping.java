package tp3;

public class Ping extends Message {
    public static final int TAG = 3;

    public Ping(int n) {
        this.n = n;
    }

    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
