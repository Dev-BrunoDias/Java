package aulas.poo;

// intuito: testar o uso da classe Pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        // new => constrói um NOVO objeto da Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Bruno"; // obj.atributo
        pessoa1.sobrenome = "Dias";
        pessoa1.idade = 40;
        pessoa1.peso = 90;
        pessoa1.altura = 1.79;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 35,
                1.75, 30.5);

        Pessoa recemNascido = new Pessoa("Enzo", "Dias");

        System.out.println(recemNascido.altura);
        recemNascido.idade++; // envelhecer
        recemNascido.dizOla();

        //chamada de métodos
        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calcularImc();
        System.out.println(imcPessoa4);


        //Exemplo pessoas
        Pessoa pedro = new Pessoa("Pedro", "Jose", 29, 1.10, 80);

        Pessoa joao = new Pessoa("Joao", "Carlos", 30, 1.75, 90);

        pedro.cumprimentar(joao);
        pedro.cumprimentar(joao);
    }
}
