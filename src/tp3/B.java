package tp3;

import mpi.*;

public class B {
    public static void main() throws InterruptedException {
        Ping[] ping = new Ping[1];
        Pong[] pong = new Pong[1];
        while (true) {
            MPI.COMM_WORLD.Recv(ping, 0, 1, MPI.OBJECT, 0, Ping.TAG);
            Thread.sleep(3000);
            pong[0] = new Pong(ping[0].getN() + 1);
            MPI.COMM_WORLD.Ssend(pong, 0, 1, MPI.OBJECT, 0, Pong.TAG);
        }
    }
}
