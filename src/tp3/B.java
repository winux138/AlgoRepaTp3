package tp3;

import mpi.*;

public class B {
    public static void main() throws InterruptedException {
        Signal[] signalBuffer = new Signal[10];
        while (true){
            MPI.COMM_WORLD.Recv(signalBuffer, 0, 1, MPI.OBJECT, 0, Signal.TAG);
            System.out.println("[B]\tmessage recu");
            Thread.sleep(3000);
        }

    }
}
