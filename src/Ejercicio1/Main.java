package Ejercicio1;


public class Main {
    public static void main(String[] args) {

        //Hacemos un array de caballos
        ThreadHorse[] horses = new ThreadHorse[10];

        //Creamos 10 Threads
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            //Creamos un caballo con nombre que hace referenacia a el valor de i
            ThreadHorse horse = new ThreadHorse("Horse "+(i+1));

            //Guardamos el caballo en el array
            horses[i] = horse;
            //Creamos el Thread con el caballo
            threads[i] = new Thread(horse);

            //Y lo iniciamos
            threads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                //Esperamos a que todos los caballos terminen
                threads[i].join();
            } catch (InterruptedException ex) {
                return;
            }
        }
    }



}