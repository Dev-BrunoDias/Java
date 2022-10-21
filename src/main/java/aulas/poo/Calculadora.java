package aulas.poo;

public class Calculadora {

    public static final double PI = 3.14;
    // final = impede a alteração do valor de PI

    //metodo estático
    // Não pertence ao objeto, mas sim a classe
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b){
        return a / b;
    }

    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(1, 2);
        double resultadoSubtracao = Calculadora.subtracao(10,5);
        double resultadomultiplicacao = Calculadora.multiplicacao(10,2);
        double resultadoSdivisao = Calculadora.divisao(10,5);
        System.out.println(Calculadora.PI);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(144)); // raiz quadrada
        System.out.println(Math.cbrt(8));// raiz cúbica
    }
}
