package Ejercicio2;

public class TrainerThread extends Thread{
    private int id;
    public TrainerThread(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Soy el Entrenador número " + id);
    }
}
