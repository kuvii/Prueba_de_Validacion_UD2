package Clases;

import java.util.ArrayList;
import java.util.List;

public class CalificationHandler extends Thread{

    static List<Integer> totalCalifications = new ArrayList<>();

    synchronized public static void addCalification(int calification){
        totalCalifications.add(calification);
    }

    public double calculateArithmeticAverage() {
        int total = 0;
        for (Integer totalCalification : totalCalifications) {
            total = total + totalCalification;
        }
  
        return (double) total / totalCalifications.size();
    }

}
