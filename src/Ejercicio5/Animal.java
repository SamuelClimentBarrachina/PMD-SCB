package Ejercicio5;

class Animal implements Runnable {
    private int distance = 3000; // 3 km
    private int paso = 100; // 100 m
    private int sleepTime; // Tiempo de descanso

    private String name;

    public Animal(String name, int sleepTime){
        this.name = name;
        this.sleepTime = sleepTime;
    }

    //Una clase que se llama animal pero es igual que la de caballo en el ejercicio 3
    @Override
    public void run() {
        for (int distanciaRecorrida = 0; distanciaRecorrida < distance; distanciaRecorrida += paso){
            System.out.println(name + ": " + (distance - distanciaRecorrida) + "m para finalizar");
            try{
                Thread.sleep(sleepTime);
            }catch (InterruptedException ex){
                return;
            }
        }
        System.out.println(name + ": ha finalizado");
    }
}
