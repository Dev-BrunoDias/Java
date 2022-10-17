package aulas.poo;

import java.sql.Struct;

public class Carro {
    String marca;
    String modelo;
    int ano;
    boolean ehFlex;
    int qtPortas;
    double combustivelAtual;

    double consumo; // quantos km por litro

    boolean estarLigado;

    Carro( String modelo, String marca, int ano, boolean ehFlex, int qtPortas, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehFlex;
        this.qtPortas = qtPortas;
        this.combustivelAtual = 30.0; //todos os carro começam com 30l
        this.consumo = consumo;
        this.estarLigado = false; // todos os carros começam desligador
    }

    //Abastecer
    void abastecer(double total) { //parâmetros do método
        this.combustivelAtual += total;
    }

    //Ligar
    void ligar() {
        this.estarLigado = true;
    }
    //Desligar
    void desligar() {
        this.estarLigado = false;
    }

    //Viajar
    boolean viajar(String local, double distancia) { // tentar viajar, se conseguir true senão false
       if(this.estarLigado) {
           this.ligar();
       }




    // calcula quantos litros serão necessários para viajem
       double totalLitros = distancia / this.consumo;

    if(this.combustivelAtual - totalLitros > 0) {
        this.combustivelAtual -= totalLitros;
        System.out.println("A viagem p/ " + local + " aconteceu. Sobrou " + this.combustivelAtual + " L");
        return true; // a viagem aconteceu
    } else {
        System.out.println("A viagem não foi possível.");
        return false; // a viagem não será possivel
    }
    }

    //A main serve pra testar a classe
    public static void main(String[] args) {
        Carro carro1 = new Carro("XY", "Ferrari", 2019, true, 4, 40);
        Carro carro2 = new Carro("z", "ford", 2000, false, 2, 50);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5); // adição de combustivel
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estarLigado);
        carro1.ligar();// mudou de desligado para ligado
        System.out.println(carro1.estarLigado);

        System.out.println(carro1.ano);
        carro1.ano = 2022; // alterar o ano do carro
        System.out.println(carro1.ano);

        boolean viajou = carro1.viajar("Fortaleza", 300);
        System.out.println(viajou);
    }

}
