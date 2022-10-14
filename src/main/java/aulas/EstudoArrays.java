package aulas;

import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros.length);
        System.out.println(numeros[3]); // pega o numero da posição do array
        numeros[3] = 1000;
        for( int i = 0; i < numeros.length; i++){
            System.out.println("A posição " + i + " com valor de " + numeros[i]);
        }
        int[] numeros2 = new int[50];
        numeros2[0] = 500;
        numeros2[1] = -200;
        numeros2[3] = 25;
        //...
        numeros2[49] = 1; // index 49 seria o ultimo!

        double[] notas = new double[5];
        String[] nomas = {"José Almir", "Renato Pereira", "Victor Icoma"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        //System.out.println("Digitte um número");
        //int quantidade = entrada.nextInt();
        //boolean[] valores = new boolean[quantidade];

        //Exemplo
        System.out.println("Digite o total de notas");
        int totalNotas = entrada.nextInt();

        double[] notasProva = new double[totalNotas];

        for( int i = 0; i < totalNotas; i++){
            System.out.println("Digite o valor da " + (i+1) + "º nota");
            notasProva[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for(double nota : notasProva) {
            soma += nota;
        }
        double media = soma / totalNotas;

        //Condição ternária
        String mensagem = (media < 7) ? "você está reprovado" : "Você está aprovado";
        System.out.println(mensagem);

        //Default values
        int numero; // padrão = 0
        double nota2; // padrão = 0.0
        long populacao; // padrao = 0
        boolean teste; // padrão false
        String nome; // null => ausência ded objeto na variável


        // Wrapper classes
        Integer numero2 =1;
        Double nota3 = 1.0;
        long pop2 = 1l;
        boolean teste2 = false;


    }
}
