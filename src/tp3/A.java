package tp3;

import mpi.*;

public class A {
    public static void main(String[] args) {
        Signal[] signalBuffer = new Signal[10];
        while (true) {
            signalBuffer[0] = new Signal();
            MPI.COMM_WORLD.Ssend(signalBuffer, 0, 1, MPI.OBJECT, 1, Signal.TAG);
        }
    }
}
