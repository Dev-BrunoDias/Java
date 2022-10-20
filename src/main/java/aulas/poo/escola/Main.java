package aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos José", "carlos.jose@gmail.com", "000000000", 7.5);
        aluno.seApresentar();

        Professor prof = new Professor("João Pedro", "joão@gmail.com", "000000000", "TI");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("Maria Antonia", "maria@gmail.com", "43546575");
        p1.seApresentar();

        //Aluno é uma pessoa
        Pessoa p2 = new Aluno("Carlos José", "carlos.jose@gmail.com", "000000000", 7.5);
        //Professor é uma pessoa
        Pessoa p3 = new Professor("João Pedro", "joão@gmail.com", "000000000", "TI");
        System.out.println("============");
        p2.seApresentar();
        p3.seApresentar();


        System.out.println("====POLIMORFISMO ABAXO=====");

        ArrayList<Pessoa> pessoas = new ArrayList<>();// Aray com todas as pessoas misturadas
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for (Pessoa pessoa : pessoas){
            // o método seApresentar se comporta diferente dependendo da classe
            //original
            pessoa.seApresentar();
        }
    }
}
