/*
3) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes
que V1 e
 */
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual tamanho dos arrays?");
        int tamanhoArray = entrada.nextInt();

        int[] v2 = new int[tamanhoArray];
        int[] v1 = new int[tamanhoArray];
        int contador = 0;

        for (int i = 0; i < tamanhoArray; i++){
            System.out.println("Inserir o valor " + (i + 1) + " do array V1:");
            v1[i] = entrada.nextInt();
        }

        for (int i = 0; i < tamanhoArray; i++){
            System.out.println("Inserir o valor " + (i + 1) + " do array V2:");
            v2[i] = entrada.nextInt();
        }


        for (int i = 0; i < tamanhoArray; i++){
            System.out.println("Valor para comparação: "+ v1[i]);
            for(int y = 0; y < tamanhoArray; y++) {
                System.out.print("Comparando: " + v2[y] + ", ");
                if (v1[i] == v2[y]) {
                    contador++;
                }
                if (y == tamanhoArray - 1){
                    System.out.print("\n");
                }
            }
        }
        System.out.println("\nQuantidade de vezes que tivemos numeros repetidos: "+ contador);
    }
}