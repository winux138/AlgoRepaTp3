package tp3;

public class Pong extends Message {
    public static final int TAG = 4;

    public Pong(int n) {
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
