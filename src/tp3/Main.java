package tp3;

import mpi.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MPI.Init(args);

        int rank;
        rank = MPI.COMM_WORLD.Rank();

        switch (rank){
            case 0:
                B.main();
                break;
            default:
                A.main();
                break;
        }

        MPI.Finalize();
    }
}
