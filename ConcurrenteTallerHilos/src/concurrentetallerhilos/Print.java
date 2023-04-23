package concurrentetallerhilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Print implements Runnable {

    private int id;
    private int x;
    private int y;

    public Print(final int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (Utils.run) {

            //This loops will print the board every 5 seconds so that we can see the updated spaces
            try {
                for (x = 0; x < 10; x++) {
                    for (y = 0; y < 10; y++) {
                        System.out.print("." + Utils.matrix[x][y] + ".");
                    }
                    System.out.println("");
                }
                System.out.println("***********************************************************************");

                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
