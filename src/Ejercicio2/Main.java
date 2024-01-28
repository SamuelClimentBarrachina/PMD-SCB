package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte un número par para N:");

        int N = sc.nextInt();

        //Recibimos un numero par y creamos mitad de entrenadores y mitad de pokemons y los entrenadores son el par y los pokemons el impar
        //LO que hacemos es que nunca un pokemon salga antes que el entrenador
        for (int i = 1; i <= N; i++){
            if (i % 2 != 0) {
                TrainerThread trainer = new TrainerThread(i+1);
                PokemonThread pokemon = new PokemonThread(i, trainer);
                Thread trainerThread = new Thread(trainer);
                Thread pokemonThread = new Thread(pokemon);
                trainerThread.start();
                try {
                    trainerThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                pokemonThread.start();
            }
        }
    }
}
