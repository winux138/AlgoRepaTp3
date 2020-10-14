package tp3;

import mpi.*;

public class A {
    public static void main() {
        int rank = MPI.COMM_WORLD.Rank();
        Signal[] signal = new Signal[1];

        for (int i = 0; i < 1000; ++i) {
            signal[0] = new Signal(i);
            switch (rank % 2) {
                case 0:
                    MPI.COMM_WORLD.Ssend(signal, 0, 1, MPI.OBJECT, 0, SigPair.TAG);
                    break;
                case 1:
                    MPI.COMM_WORLD.Ssend(signal, 0, 1, MPI.OBJECT, 0, SigImpair.TAG);
                    break;
            }
        }
    }
}
