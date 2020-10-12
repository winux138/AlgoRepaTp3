package tp3;

import mpi.*;

public class Main {

    public static void main(String[] args) {
        MPI.Init(args);

        int rank;
        rank = MPI.COMM_WORLD.Rank();

        switch (rank){
            case 0:
                break;
            case 1:
                break;
        }

        MPI.Finalize();
    }
}
