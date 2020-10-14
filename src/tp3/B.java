package tp3;

import mpi.*;

public class B {
    public static void main() throws InterruptedException {

        int somme = 0;
        Signal[] signal = new Signal[1];

        while (true) {
            // reception du message
            Status status = MPI.COMM_WORLD.Recv(signal, 0, 1, MPI.OBJECT, MPI.ANY_SOURCE, Signal.TAG);

            // traitement du message
            somme += signal[0].getN();
            System.out.println("signal(" + signal[0].getN() + ")\trecu de A[" + status.source + "]");
            System.out.println("somme = " + somme);
            //Thread.sleep(1000);
        }
    }
}
