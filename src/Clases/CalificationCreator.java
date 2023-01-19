package Clases;

import java.util.ArrayList;
import java.util.List;

public class CalificationCreator extends Thread {
    private String id;
    private int STARTING_INDEX;
    private int TOTAL_CREATION_NUM;

    public CalificationCreator(String id, int starting_index, int TOTAL_CREATION_NUM) {
        this.id = id;
        this.STARTING_INDEX = starting_index;
        this.TOTAL_CREATION_NUM = TOTAL_CREATION_NUM;
    }

    @Override
    synchronized public void run() {
        int counter = this.STARTING_INDEX;
        for (int i = this.STARTING_INDEX; i < TOTAL_CREATION_NUM; i++) {
            int randomCalification = (int) (Math.random() * 10);
            CalificationHandler.addCalification(randomCalification);
            counter++;
        }
        System.out.println("El hilo " + this.id + " que empezó en el indice " + this.STARTING_INDEX + " ha contado " + counter + " calificaciones");


    }
}
