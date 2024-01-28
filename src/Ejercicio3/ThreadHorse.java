package Ejercicio3;

class ThreadHorse implements Runnable {
    private int distance = 5000;
    private int paso = 100;
    private int sleepTime;

    private String name;

    public ThreadHorse(String name, int sleepTime){
        this.name = name;
        this.sleepTime = sleepTime;
    }

    //Es igual al Ejercicio 1 pero le pasamos el tiempo que tiene que dormir en vez de que sea todo el rato igual
    @Override
    public void run() {

        for (int distanciaRecorrida = 0; distanciaRecorrida< distance; distanciaRecorrida+=paso){

            System.out.println(name+": "+(distance -distanciaRecorrida)+"m para finalizar");
            try{
                Thread.sleep(sleepTime);
            }catch (InterruptedException ex){
                return;
            }
        }
        System.out.println(name+": ha finalizado");
    }
}
