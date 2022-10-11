//1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: (switch-case)

//  1 – Adição
//  2 – Subtração
//  3 – Multiplicação
//  4 – Divisão

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        double NumeroUm, NumeroDois, Total;
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
                Total = NumeroUm + NumeroDois;
                System.out.println(NumeroUm + NumeroDois);
                break;
            case 2:
                Total = NumeroUm - NumeroDois;
                System.out.println(NumeroUm - NumeroDois);
                break;
            case 3:
                Total = NumeroUm * NumeroDois;
                System.out.println(NumeroUm * NumeroDois);
                break;
            case 4:
                Total = NumeroUm / NumeroDois;
                System.out.println(NumeroUm / NumeroDois);
        }


    }
}
