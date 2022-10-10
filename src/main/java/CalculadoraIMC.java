import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("QUal seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual sua idade");
        int idade = entrada.nextInt();

        System.out.println("Qual sua altura (m)?");
        double altura = entrada.nextDouble();

        System.out.println("Qual o seu peso? (kg)");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura); // peso / Math.pow(altura, 2)

        System.out.println(" Olá, meu nome é " + nome + " meu peso é " + peso + ", eu tenho " + altura + " de altura e tenho " + idade +" anos!");
        System.out.println("Este é o seu IMC = " + imc);
        System.out.printf("Este é o seu IMC = %.2f\n", imc); // limita em 2 casas decimais
        System.out.printf("Olá, meu nome é %s e tenho %d anos!\n", nome, idade); // %s = string / %d = numero / %.2f limita casa decimal
    }
}
