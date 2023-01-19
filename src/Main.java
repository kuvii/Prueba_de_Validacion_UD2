import Clases.CalificationCreator;
import Clases.CalificationHandler;
import jdk.swing.interop.SwingInterOpUtils;

import java.net.SocketTimeoutException;

public class Main {

    static int CALIFICATIONS_THREAD_TO_CREATE = 10000;
    static int STARTING_INDEX = 0;
    public static void main(String[] args) throws InterruptedException {
        CalificationHandler h1 = new CalificationHandler();
        CalificationCreator c1 = new CalificationCreator("Creator 1", STARTING_INDEX, CALIFICATIONS_THREAD_TO_CREATE);
        CalificationCreator c2 = new CalificationCreator("Creator 2", (STARTING_INDEX + CALIFICATIONS_THREAD_TO_CREATE), (CALIFICATIONS_THREAD_TO_CREATE * 2));
        CalificationCreator c3 = new CalificationCreator("Creator 3", (STARTING_INDEX + (CALIFICATIONS_THREAD_TO_CREATE * 2)), (CALIFICATIONS_THREAD_TO_CREATE * 3));
        CalificationCreator c4 = new CalificationCreator("Creator 4", (STARTING_INDEX + (CALIFICATIONS_THREAD_TO_CREATE * 3)), (CALIFICATIONS_THREAD_TO_CREATE * 4));
        CalificationCreator c5 = new CalificationCreator("Creator 5", (STARTING_INDEX + (CALIFICATIONS_THREAD_TO_CREATE * 4)), (CALIFICATIONS_THREAD_TO_CREATE * 5));
        CalificationCreator c6 = new CalificationCreator("Creator 6", (STARTING_INDEX + (CALIFICATIONS_THREAD_TO_CREATE * 5)), (CALIFICATIONS_THREAD_TO_CREATE * 6));
        CalificationCreator c7 = new CalificationCreator("Creator 7", (STARTING_INDEX + (CALIFICATIONS_THREAD_TO_CREATE * 6)), (CALIFICATIONS_THREAD_TO_CREATE * 7));
        CalificationCreator c8 = new CalificationCreator("Creator 8", (STARTING_INDEX + (CALIFICATIONS_THREAD_TO_CREATE * 7)), (CALIFICATIONS_THREAD_TO_CREATE * 8));
        CalificationCreator c9 = new CalificationCreator("Creator 9", (STARTING_INDEX + (CALIFICATIONS_THREAD_TO_CREATE * 8)), (CALIFICATIONS_THREAD_TO_CREATE * 9));
        CalificationCreator c10 = new CalificationCreator("Creator 10", (STARTING_INDEX + (CALIFICATIONS_THREAD_TO_CREATE * 9)), (CALIFICATIONS_THREAD_TO_CREATE * 10));

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();
        c5.join();
        c6.join();
        c7.join();
        c8.join();
        c9.join();
        c10.join();

        System.out.println("La media aritmética es de " + h1.calculateArithmeticAverage());
    }
}
