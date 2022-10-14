package exercicio;//1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: (switch-case)

//  1 – Adição
//  2 – Subtração
//  3 – Multiplicação
//  4 – Divisão

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        double NumeroUm, NumeroDois;
        System.out.println(" digite uma das operações matemáticas a seguir:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int operacao = entrada.nextInt();

        System.out.println("digite um número");
        NumeroUm = entrada.nextDouble();

        System.out.println("Digite outro numero");
        NumeroDois = entrada.nextDouble();

        switch (operacao){
            case 1:
                double soma = NumeroUm + NumeroDois;
                System.out.println("A soma é " + soma);
                break;
            case 2:
                double subtracao= NumeroUm - NumeroDois;
                System.out.println("A dubtração é " + subtracao);
                break;
            case 3:
                double multiplicacao = NumeroUm * NumeroDois;
                System.out.println("A multiplicação é " + multiplicacao);
                break;
            case 4:
                double divisao = NumeroUm / NumeroDois;
                System.out.println("A divisão é " + divisao);
                break;
            default:
                System.out.println("Valor inválido, digite números válidos");
        }


    }
}
