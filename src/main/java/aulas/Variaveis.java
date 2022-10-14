package aulas;

public class Variaveis {
    public static void main(String[] args){
        System.out.println("Hello, World");

        int idade = 20; //inteiro
        double salario = 4500.99; // dupla precisão de numeros casas decimais
        float nota = 7.5f; // sufixo para flout usa o f no final do numeral
        long popularcaoTerra = 7_900_000_000l;
        boolean tarefaComcluida = false; // (true ou false)
        int i = 1, j = 0, k = 1000; // multiplas variaveis
        String nomeCompleto = "José Almir"; // Sempre aspas duplas

        int teste = 10;
        teste = 9; // retribuição de variáveis

        final int teste2 = 200; // Impossível mudar o valor

        int a = 10;
        int b = 5;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;

        System.out.println("O resultado da soma é:" + soma);

        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        double resultado = sete / dois;
        System.out.println(resultado);
        double resultado2 = sete /dois2;
        System.out.println(resultado2);

        //Math
        double x = Math.sqrt(144); // 12
        double y = Math.pow(5, 2); // 25
        System.out.println(Math.PI);
        //casting
        int pi2 = (int)Math.PI; // elimina a parte decimal, perdeu informação
        System.out.println(pi2);

        double resultado3 = sete / (double) dois; // 7 / 2.0

        //operadores 2
        int valor = 5;
        valor ++; // incrementar
        valor --; // decrementar

        valor += 10; // valor = valor + 10

        boolean teste1 = 5 > 1; // true
        boolean teste3 = 5 < 1; // false
        boolean teste4 = 5 == 5; // true
        boolean teste5 = 5 != 1; // true // != significa diferente
        boolean teste6 = 6 >= 6; // true
        boolean teste7 = 5 <= 9; // true

        //operadores lógicos
        boolean teste8 = true && false; //false
        boolean teste9 = true || false; //true
        boolean teste10 = (5 > 10) && (10<5); // false
        boolean teste11 = (10 >= 0) || (1 < 5); // true
        boolean teste12 = (5 > 1); //true
        boolean teste13 = !teste12; //false
    }
}

