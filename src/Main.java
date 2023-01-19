import Clases.Comensal;

public class Main {

    static int CUPCAKES_TO_TAKE = 5;
    public static void main(String[] args)  {
        Thread c1 = new Thread(new Comensal("Fred", 1, CUPCAKES_TO_TAKE));
        Thread c2 = new Thread(new Comensal("Luna", 5, CUPCAKES_TO_TAKE));
        Thread c3 = new Thread(new Comensal("Juan", 10, CUPCAKES_TO_TAKE));

        c1.start();
        c2.start();
        c3.start();
    }
}
