package aulas.poo;

import java.util.ArrayList;

public class Pessoa {
    // Propriedades / atributos de uma pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;



    Pessoa() { // construtor da classe
        // this => representa o objeto
        this.nome = "Bruno";
        this.sobrenome = "Dias";
        this.idade = 40;
        this.peso = 90;
        this.altura = 1.79;
    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.peso = 0.5;
        this.altura = 2.0;
    }


    // Ações de uma pessoa (métodos)
    // <tipo_retorno> nomeDoMetodo(PARAMETROS0 {}
    void dizOla(){ // Método que não retorna nada
        System.out.println("Olá, tudo bem? Meu nome é " + this.nome);
    }

    void mostrarImc(){
        //double imc = this.peso / (this.altura * this.altura);
        double imc = this.calcularImc(); // esse mostra e chama o calculo da operação abaixo
        System.out.println("O meu IMC é " + imc);
    }

    double calcularImc(){ // deve retornar um valor (return)
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void cumprimentar(Pessoa pessoa) {
        this.dizOla();
        pessoa.dizOla();

        if(!this.conhecePessoa(pessoa)) {
            this.addPessoaNova(pessoa);
            pessoa.addPessoaNova(this); //this é o objeto que chama cumprimentar()
        }
    }

    void addPessoaNova(Pessoa pessoa) { // faz o objeto "conhecer" estar dentro do array
        System.out.println(this.nome + " conheceu " + pessoa.nome + " !!");
        this.conhecidos.add(pessoa);
    }
    boolean conhecePessoa(Pessoa pessoa){
        //se true, a pessoa (this) conhece a outra pessoa
        // se false não conhece
        return this.conhecidos.contains(pessoa);
    }



}
