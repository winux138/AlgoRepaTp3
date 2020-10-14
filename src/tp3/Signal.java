package tp3;

public class Signal extends Message{
    public static final int TAG = 0;

    private int n;

    public Signal(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
