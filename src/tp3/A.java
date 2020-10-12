package tp3;

import mpi.*;

public class A {
    public static void main() {
        Tip[] tip = new Tip[1];
        Top[] top = new Top[1];
        while (true) {
            if (0.5 < Math.random()) {
                tip[0] = new Tip((int) (100 * Math.random()), (float) (Math.random()));
                MPI.COMM_WORLD.Ssend(tip, 0, 1, MPI.OBJECT, 1, Tip.TAG);
                System.out.println("[A]\ttip envoyé avec n = "+tip[0].getN()+" et x = "+tip[0].getX());
            } else{
                top[0] = new Top();
                MPI.COMM_WORLD.Ssend(top, 0, 1, MPI.OBJECT, 1, Top.TAG);
                System.out.println("[A]\ttop envoyé");
            }
        }
    }
}
