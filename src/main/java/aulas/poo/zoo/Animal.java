package aulas.poo.zoo;

// Na interface você define um conjunto de métodos ( sem corpo)
// E a classe que "herda" deve implementar esstes métodos
public interface Animal {
    void dormir(); // Definição do método apenas
    void fazerSom();
    void comer(String comida);
}

class Gato implements Animal{

    @Override
    public void dormir() {
        System.out.println(" ZZZzzzZZZ");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
        if(comida.equals("peixe")){
            System.out.println("Hummm, gosto de peixe");
        } else {
            System.out.println("Só como peixe");
        }
    }
}

class Galinha implements Animal{

    @Override
    public void dormir() {
        System.out.println(" ZZzzzZZ");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có có có");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hum có có " + comida );
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");

        Animal animalGalinha = new Galinha();
        Animal animalGatinho = new Gato();
        System.out.println("===POLIMORFISMO===");
        animalGalinha.fazerSom();
        animalGatinho.fazerSom();
    }
}
