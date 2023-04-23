package concurrentetallerhilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Semilla implements Runnable{
    
    private int id;
    private int x;
    private int y;
    
    public Semilla(final int id) {
        this.id = id;
    }
    
    @Override
    public void run() {
        while (Utils.run){
            
            try {
                x = (int) (Math.random() * 10);
                y = (int) (Math.random() * 10);

                Utils.matrix[x][y] = "   >>*<<   "; 

                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Semilla.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}