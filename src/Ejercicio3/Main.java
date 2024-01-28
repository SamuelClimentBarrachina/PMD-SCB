package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        ThreadHorse[] horses = new ThreadHorse[10];
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            //Para que el primer caballo sea el utlitmop y al revés lo que hacemos es con forme vayan saliendo los caballos
            //les vamos asignando un menor tiemo de sleep para que lleguen antes, este decrece dependiendo del valor de i
            int sleepTime = (10 - i) * 200;
            ThreadHorse horse = new ThreadHorse("Horse "+(i+1), sleepTime);
            horses[i] = horse;
            threads[i] = new Thread(horse);
            threads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException ex) {
                return;
            }
        }
    }
}