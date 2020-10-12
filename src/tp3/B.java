package tp3;

import mpi.*;

public class B {
    public static void main() throws InterruptedException {
        //Tip[] tip = new Tip[1];
        //Top[] top = new Top[1];
        Message[] message = new Message[1];
        while (true) {
            MPI.COMM_WORLD.Recv(message, 0, 1, MPI.OBJECT, 0, MPI.ANY_TAG);
            if (message[0] instanceof Tip) {
                System.out.println("[B]\ttip recu avec n = " + ((Tip) message[0]).getN() + " et x = " + ((Tip) message[0]).getX());
            } else {
                System.out.println("[B]\ttop recu");
            }
            Thread.sleep(3000);
        }

    }
}
