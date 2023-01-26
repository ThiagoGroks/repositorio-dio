/*
 * Faça um programa que leia 20 números aleatórios
 * e armazene-os em um vetor. AO final mostre os números
 * e seus sucessores.
 */
import java.util.Random;
public class Aleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt( 100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }
}
