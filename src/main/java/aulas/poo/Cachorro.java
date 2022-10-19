package aulas.poo;

//Cachorro é a sub-classe/ classe filha de PET
public class Cachorro extends Pet{ // extends pega a Superclasse Pet
    private String comidaFavorita;
    private String raca;

    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca){
       // representa a classe Pet
        super(nome, idade, peso); // chamando o construtor da classe Pai/superclasse
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override //anotação = vamos sobrescrever a ação de fazer som
    public void fazerSom() {
        System.out.println("Au auuuuu");
    }

    @Override
    public void brincar() { //ocachorro late na hora de brincar
        this.fazerSom(); // chama o fazerSom do cachorro, foi sobreescrito
        super.brincar();// está chamando o brincar() de Pet
        this.dormir(); // chama o dormir do pet, pois não foi sobrescrito
    }

    @Override
    public void comer(String comida) { // .equals = comparar o conteudo das Strings
        if(comida.equals(this.comidaFavorita)){
            super.comer(comida);
            this.peso += 0.2;
            //this.setPeso(this.getPeso() + 0.2); // essa só quando o peso tivesse privado

        }else {
            System.out.println("Quero" + comida + " não!");
        }
    }

    public void correrAtrasMoto(){ // método específico do cachorro
        this.fazerSom();
        System.out.println("Corre atrás da moto");
    }

    public static void main(String[] args) {
        //testar a herança
        Pet pet1 = new Pet("fred", 3, 12.5);
        pet1.dormir();
        pet1.comer(" Batata");

        Cachorro bob = new Cachorro("Rex", 5, 25, "Osso", "Pit Bull");
        bob.dormir();
        bob.fazerSom();
        bob.comer(" Ração");
        bob.setPeso(30);
        bob.comer(" Osso");
        bob.correrAtrasMoto();



    }
}
