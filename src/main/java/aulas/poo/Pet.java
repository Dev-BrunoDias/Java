package aulas.poo;

//Super classe
public class Pet {
    private String nome;
    private int idade;
    protected double peso;
    // nas subclasse o atributo/ método não é acessível.
    //protected permite acesso direto nas subclasses

    //construtor
    public Pet(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerSom(){
        System.out.println("...");
    }

    public void comer(String comida){
        System.out.println("Estou comendo" + comida);
    }

    public void dormir() {
        System.out.println("zzzzzzzz");
    }

    public void brincar() {
        System.out.println("Estou brincando...");
    }

    public double getPeso(){ // apenas leitura do peso
        return this.peso;
    }

    public void setPeso(double novoValorPeso) { // possibilita aterar o peso
        this.peso = novoValorPeso;

    }

}
