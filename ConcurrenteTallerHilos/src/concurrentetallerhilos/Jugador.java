package concurrentetallerhilos;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Jugador implements Runnable {

    private int id;
    private int x;
    private int y;
    ConcurrenteTallerHilos kill = new ConcurrenteTallerHilos();

    public Jugador(final int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (Utils.run) {

            try {
                
                
                x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la FILA donde deseas colocarte y presiona enter (1-10)"))-1;
                y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la COLUMNA donde deseas colocarte y presiona enter (1-10)"))-1;
                
                
                /*Scanner xx = new Scanner(System.in);
                System.out.println("Ingresa la FILA donde deseas colocarte y presiona enter");
                this.x = xx.nextInt();

                Scanner yy = new Scanner(System.in);
                System.out.println("Ingresa la COLUMNA donde deseas colocarte y presiona enter");
                this.y = yy.nextInt();*/

                switch (Utils.matrix[x][y]) {
                    case "           ":
                        Utils.matrix[x][y] = " ⋐( ❛ ͜ʖ ❛ )⋑ ";
                        break;
                    case "   >>*<<   ":
                        Utils.matrix[x][y] = ">⋐( ❛ ͜ʖ ❛ )⋑<";
                        break;
                    case " ～～～～(゜<~  ":
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("******************************FELICIDADES******************************");
                        System.out.println("*******************************HA GANADO*******************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");

                        ConcurrenteTallerHilos.service.shutdown();
                        Utils.run = false;

                        break;
                    case " ～～2～(゜<~  ":
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("******************************FELICIDADES******************************");
                        System.out.println("*******************************HA GANADO*******************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");

                        ConcurrenteTallerHilos.service.shutdown();
                        Utils.run = false;

                        break;
                    case " ～～3～(゜<~  ":
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("******************************FELICIDADES******************************");
                        System.out.println("*******************************HA GANADO*******************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");

                        ConcurrenteTallerHilos.service.shutdown();
                        Utils.run = false;

                        break;
                    case " ～～4～(゜<~  ":
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("******************************FELICIDADES******************************");
                        System.out.println("*******************************HA GANADO*******************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");
                        System.out.println("***********************************************************************");

                        ConcurrenteTallerHilos.service.shutdown();
                        Utils.run = false;

                        break;
                    default:
                }

                Thread.sleep(5000);

            } catch (InterruptedException ex) {
                Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}

