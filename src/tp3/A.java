package tp3;

import mpi.*;

public class A {
    public static void main() {
        Signal[] signal = new Signal[1];
        for (int i = 0; i < 1000; ++i) {
            signal[0] = new Signal(i);
            MPI.COMM_WORLD.Ssend(signal, 0, 1, MPI.OBJECT, 0, Signal.TAG);
        }
    }
}
