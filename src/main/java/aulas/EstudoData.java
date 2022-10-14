package aulas;

import java.time.LocalDate;

public class EstudoData {
    public static void main(String[] args) {
        //dia - mês - ano
        // LocalDate armazena qualquer data (dia, mês ano)
        LocalDate hoje = LocalDate.now(); // pega a data atual
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022, 12, 25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal));// verifica se a data é depois do natal
        System.out.println(hoje.isBefore(natal));// verifica se a data é antes do natal
        int ano = hoje.getYear(); // o ano da data
        int mes = hoje.getMonthValue(); // o numero do mês
        int dia = hoje.getDayOfMonth(); // o numero do dia do mes

        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear();

        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);

        System.out.println("Faltam " + diasParaNatal + " dias para o Natal!");
        System.out.println(hoje.getDayOfYear() - natal.getDayOfYear()); // -73
    }
}
