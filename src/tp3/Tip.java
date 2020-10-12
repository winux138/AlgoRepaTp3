package tp3;

public class Tip extends Message {
    public static final int TAG = 1;
    private int n;
    private float x;

    public Tip(int n, float x) {
        this.n = n;
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
}
