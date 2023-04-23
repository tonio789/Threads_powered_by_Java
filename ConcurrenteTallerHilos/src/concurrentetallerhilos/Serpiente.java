package concurrentetallerhilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Serpiente implements Runnable {

    private int id;
    private int x;
    private int y;

    public Serpiente(final int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (Utils.run) {

            try {
                this.x = (int) (Math.random() * 10);
                this.y = (int) (Math.random() * 10);

                switch (Utils.matrix[x][y]) {
                    case "           ":
                        Utils.matrix[x][y] = " ～～～～(゜<~  ";
                        break;
                    case "   >>*<<   ":
                        Utils.matrix[x][y] = " ～～～～(゜<~  ";
                        break;
                    case " ～～～～(゜<~  ":
                        Utils.matrix[x][y] = " ～～2～(゜<~  ";
                        break;
                    case " ～～2～(゜<~  ":
                        Utils.matrix[x][y] = " ～～3～(゜<~  ";
                        break;
                    case " ～～3～(゜<~  ":
                        Utils.matrix[x][y] = " ～～4～(゜<~  ";
                        break;
                    case " ⋐( ❛ ͜ʖ ❛ )⋑ ":
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("*******************************GAME OVER*******************************");
                        System.out.println("*******************************PERDISTE!*******************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");

                        ConcurrenteTallerHilos.service.shutdown();
                        Utils.run = false;

                        break;
                    default:
                }

                Thread.sleep(10000);

                Utils.matrix[x][y] = "          ";

            } catch (InterruptedException ex) {
                Logger.getLogger(Serpiente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
