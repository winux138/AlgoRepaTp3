package tp3;

import mpi.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class B {
    public static void main() throws InterruptedException {

        boolean pair = false;
        int somme = 0;
        Signal[] signal = new Signal[1];

        while (true) {
            // reception du message
            Status status;
            if (pair) {
                status = MPI.COMM_WORLD.Recv(signal, 0, 1, MPI.OBJECT, MPI.ANY_SOURCE, SigPair.TAG);
                pair = !pair;
            } else {
                status = MPI.COMM_WORLD.Recv(signal, 0, 1, MPI.OBJECT, MPI.ANY_SOURCE, SigImpair.TAG);
                pair = !pair;
            }
            // traitement du message
            somme += signal[0].getN();
            System.out.println("signal(" + signal[0].getN() + ")\trecu de A[" + status.source + "]");
            System.out.println("somme = " + somme);
            //Thread.sleep(1000);
        }
    }
}
