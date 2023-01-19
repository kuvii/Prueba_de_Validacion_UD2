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
        for (int i = 0; i < totalCalifications.size(); i++) {
            total = total + totalCalifications.get(i);
        }
        System.out.println(total);
        double result = (double) total / totalCalifications.size();
        return result;
    }

}
