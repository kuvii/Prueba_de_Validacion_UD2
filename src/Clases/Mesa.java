package Clases;

public class Mesa {

    private static int maxCupcakes = 15;

    synchronized static void takeCupcake(String ThreadName) throws InterruptedException {
        maxCupcakes--;
        System.out.println(ThreadName + " ha cogido una magdalena de la mesa");
    }
}
