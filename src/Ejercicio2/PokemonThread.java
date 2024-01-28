package Ejercicio2;

public class PokemonThread implements Runnable{

    private final Thread thread;
    private final int id;
    public PokemonThread(int id, Thread thread){
        this.id = id;
        this.thread = thread;
    }


    //Imprime por consola el id del pokemon y espera a que acabe el hilo
    @Override
    public void run() {
        try {
            thread.join();
            System.out.println("Soy el Pokémon número " + id);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
