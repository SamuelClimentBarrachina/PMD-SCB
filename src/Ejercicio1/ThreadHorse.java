package Ejercicio1;

class ThreadHorse implements Runnable {
    private int distance = 5000;
    private int paso = 100;

    private String name;

    public ThreadHorse(String name){
        this.name = name;
    }

    @Override
    public void run() {

        //Esto lo que hace es que ek caballo habance x mettros y luego "dormimos" el hilo para que no se ejecute hasta "despertar" en x tiempo
        for (int distanciaRecorrida = 0; distanciaRecorrida< distance; distanciaRecorrida+=paso){

            System.out.println(name+": "+(distance -distanciaRecorrida)+"m para finalizar");
            try{
                Thread.sleep(200);
            }catch (InterruptedException ex){
                return;
            }
        }
        System.out.println(name+": ha finalizado");
    }
}
