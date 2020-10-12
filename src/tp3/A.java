package tp3;

import mpi.*;

public class A {
    public static void main() {
        Ping[] ping = new Ping[1];
        Pong[] pong = new Pong[1];
        while (true) {
            ping[0] = new Ping((int) (100 * Math.random()));
            MPI.COMM_WORLD.Ssend(ping, 0, 1, MPI.OBJECT, 1, Ping.TAG);
            System.out.println("[A]\tPing envoyé avec n = " + ping[0].getN());
            MPI.COMM_WORLD.Recv(pong, 0, 1, MPI.OBJECT, 1, Pong.TAG);
            System.out.println("[A]\tPong recu avec n = " + pong[0].getN());
        }
    }
}
