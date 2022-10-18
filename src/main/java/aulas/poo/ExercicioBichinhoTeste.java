package aulas.poo;

public class ExercicioBichinhoTeste {
    public static void main(String[] args) {
        ExercicioBichinho bicho1 = new ExercicioBichinho("bob", 5, 35);

        System.out.println(bicho1.nome);
        bicho1.comer("Arroz");
    }
}
