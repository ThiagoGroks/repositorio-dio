/*
 * Crie um vetor de 6 numeros e
 * mostre-os na ordem inversa.
 */
public class Array {
    public static void main(String[] args) {
        
        int[] vetor = {118, 13, 54, 8, 9, 0};

        int count = 0; //array começa na posição 0;
        System.out.print("Array: ");
        while(count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("Array 2: ");
        for (int i = vetor.length - 1; i >= 0 ; i--) {
            System.out.println(vetor[i]);
        }
        
    
    }
}
