package Clases;

public class Comensal implements Runnable{

    private String threadName;
    private int cupcakesToTake;

    public Comensal(String threadName, int priority, int cupcakesToTake) {
        this.threadName = threadName;
        this.cupcakesToTake = cupcakesToTake;
        Thread thread = new Thread(this);
        thread.setPriority(priority);
    }

    public String getThreadName() {
        return this.threadName;
    }

    public int getCupcakesToTake() {
        return cupcakesToTake;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < getCupcakesToTake(); i++) {
                Mesa.takeCupcake(getThreadName());
                Thread.sleep(10000);
                System.out.println(getThreadName() + " se ha terminado de comer una magdalena");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
