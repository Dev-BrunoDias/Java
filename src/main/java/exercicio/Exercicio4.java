package exercicio;

import java.util.Scanner;

/*
4) Criar um programa que lê a idade de uma pessoa e diz se ela é maior de idade ou não.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        if(idade< 18) {
            System.out.println(" Voce é menor de idade");
        }
        else {
            System.out.println(" Voce é maior de idade");
        }
    }
}