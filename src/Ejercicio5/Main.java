package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[8];
        Thread[] threads = new Thread[8];

        // Crear instancias de Animal y dependiendo de que animal es le poenemos un tiempo de sleep diferente para asegurarnos que
        //siempre llegan igual
        for (int i = 0; i < 4; i++) {
            animals[i] = new Animal("Tortuga " + (i+1), 200);
        }
        for (int i = 4; i < 7; i++) {
            animals[i] = new Animal("Conejo " + (i-3), 100);
        }
        animals[7] = new Animal("Guepardo", 50);

        // Arrancar hilos para cada animal
        for (int i = 0; i < 8; i++) {
            threads[i] = new Thread(animals[i]);
            threads[i].start();
        }

        // Esperar a que todos los animales terminen la carrera
        for (int i = 0; i < 8; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException ex) {
                return;
            }
        }
    }
}