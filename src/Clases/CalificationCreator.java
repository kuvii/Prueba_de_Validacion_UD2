package Clases;

public class CalificationCreator extends Thread {
    private String threadName;
    private int startingIndex;
    private int maxCreateNum;

    public CalificationCreator(String id, int startingIndex, int maxCreateNum) {
        this.threadName = id;
        this.startingIndex = startingIndex;
        this.maxCreateNum = maxCreateNum;
    }

    public String getThreadName() {
        return threadName;
    }

    public int getStartingIndex() {
        return startingIndex;
    }

    public int getMaxCreateNum() {
        return maxCreateNum;
    }

    @Override
    synchronized public void run() {
        int counter = 0;
        for (int i = getStartingIndex(); i < getMaxCreateNum(); i++) {
            int randomCalification = (int) (Math.random() * 10);
            CalificationHandler.addCalification(randomCalification);
            counter++;
        }
        System.out.println("El hilo " + getThreadName() + " que empezó en el indice " + getStartingIndex() + " ha contado " + counter + " calificaciones");


    }
}
