import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        //string são cadeias de caracteres
        // "José" -> J = 0, o = 1, s = 2, é = 3
        String nome = "Pedro";

        if(nome == "Pedro"){ // compara o endereço
            System.out.println("São iguais!");
        }

        System.out.println("Digite seu sobrenome");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if(sobrenome.equals("Pereira")){ // .equals aqui compara o conteudo das strings
            System.out.println("São iguais");
        } else{
            System.out.println("São diferentes");
        }

        // sobrenome.equalsIgnoreCase("pereira"), -  ignora maiusculo ou minusculo

        //outros métodos
        String java = "Java";
        String ja = java.substring(0, 2); // começa do 0 e vai até o 2( não incuso, pega o 0 e o 1)
        String va = java.substring(2); // corta do 2 até o final da string

        System.out.println(ja);
        System.out.println(va);

        String m1 = "Hello,";
        String m2 = "World";
        String m3 = m1.concat(m2); // m1 + m2
        System.out.println(m3);

        System.out.println(java.length()); // quantos caracteres ela possui
        System.out.println(java.isEmpty()); // verifica se está vazia =>"" resultado boolean
        System.out.println(java.toUpperCase()); // JAVA em CAIXA ALTA
        System.out.println(java.toLowerCase()); // java em caixa baixa

        //Exemplo
        System.out.println("Digite um nome");
        String seuNome = entrada.nextLine();

        if(seuNome.toUpperCase().equals("JOSÈ")){
            System.out.println("SEU NOME È JOSÈ");
        }
        // .split retira o caracter desejado
        String data = "13/10/2022";
        String[] valores = data.split("/"); // [ "13". "10", "2022"]
        System.out.println(valores[0]);

        String email = "jose.almir@gmail.com";
        String[] valoresEmail = email.split("@"); // ["jose.almir". "gmail.com"]
        System.out.println(valoresEmail[0]);

        String nome2 = "José Souza";
        String[] nomeSeparado = nome2.split(" ");
        System.out.println(nomeSeparado[0]);

        String teste = "Amanha é sexta-feira!";
        String[] teste2 = teste.split("");
        System.out.println(Arrays.toString(teste2)); // toString mostra o conteudo dentro do array

    }
}
