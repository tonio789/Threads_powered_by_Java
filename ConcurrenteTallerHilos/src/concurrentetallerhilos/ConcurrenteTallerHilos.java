package concurrentetallerhilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrenteTallerHilos {

    private static int x;
    private static int y;
    public static ExecutorService service;

    public static void main(String[] args) {

        for (x = 0; x < 10; x++) {
            for (y = 0; y < 10; y++) {
                Utils.matrix[x][y] = "           ";
            }
        }

        Semilla semilla1 = new Semilla(1);
        Semilla semilla2 = new Semilla(2);
        Semilla semilla3 = new Semilla(3);
        Serpiente serpiente1 = new Serpiente(1);
        Serpiente serpiente2 = new Serpiente(2);
        Serpiente serpiente3 = new Serpiente(3);
        Serpiente serpiente4 = new Serpiente(4);

        Jugador jugador = new Jugador(1);

        Print print = new Print(1);

        service = Executors.newFixedThreadPool(15);

        service.submit(semilla1);
        service.submit(semilla2);
        service.submit(semilla3);
        service.submit(serpiente1);
        service.submit(serpiente2);
        service.submit(serpiente3);
        service.submit(serpiente4);
        service.submit(jugador);
        service.submit(print);
    }

}
