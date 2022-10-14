package aulas;

import java.util.ArrayList;

public class EstudoListas {
    public static void main(String[] args) {
        // Cria um novo ArrayList vazio que guarda Integer
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();


        System.out.println(numeros);

        numeros.add(10); // equivale ao push do JS
        numeros.add(20);
        numeros.add(1000);
        System.out.println(numeros);
        System.out.println(numeros.get(2)); //.get pega o elemento na posição desejada
        numeros.set(0, 500); // muda o valor da posição desejada no caso 0 para 500

        System.out.println(numeros);

        numeros.remove( 0); // remove o elemento na posição zero

        System.out.println(numeros);

        numeros.add(1, 200); // adiciona o elemento na posição e move os demais
        System.out.println(numeros);

        numeros.add(3, 200);
        System.out.println(numeros);

        System.out.println(numeros.size()); // array.length

        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

        System.out.println("-------------");

        for(int numero : numeros){ // Para cada valor dentro do array ele executa o código
            System.out.println(numero);
        }

        System.out.println(numeros.contains(500)); // true = achou o numero, false = não achou
        System.out.println(numeros.indexOf(1000)); // qual a posição do 1000 na lista?
        System.out.println(numeros.indexOf(500)); // -1 = não achou o elemento
        System.out.println(numeros.indexOf(200)); // moostra o primeiro array encontrado
        System.out.println(numeros.lastIndexOf(200)); // mostra o ultimo encontrado
    }
}
