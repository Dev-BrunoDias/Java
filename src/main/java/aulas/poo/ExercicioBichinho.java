package aulas.poo;


//Crie uma classe Bichinho:
//	* Atributos: nome, idade, peso, bucho (lista de Comida), estaDormindo(boolean)
//	* Construtores: Cria bichinhos com base nos atributos nome, idade, peso. Bucho deve começar com lista vazia. estaDormindo deve iniciar false.
//	* Métodos:
//	- comer(Comida comida) => a comida deve alterar o peso do bichinho, o bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
//	 - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada hora dormida o bichinho perde 10% de seu peso atual;
//	- acordar() => altera o boolean estaDormindo p/ false
//
//Crie uma classe Comida:
//	* Atributos: nome, peso;
//	* Construtores: Cria a comida com base nos parâmetros nome e peso;
//	* Métodos:
//	- getNome()
//	- getPeso()


import java.util.ArrayList;

public class ExercicioBichinho {
    String nome;

    double idade;

    double peso;

    String bucho[];

    boolean estaDormindo;

    ExercicioBichinho(String nome, double idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = 35;
        this.estaDormindo = false;
        this.bucho = null;

    }

    double comer(String comida) {
        System.out.println("Estou comendo " + comida);
        return this.peso += 0.5;
    }




}
