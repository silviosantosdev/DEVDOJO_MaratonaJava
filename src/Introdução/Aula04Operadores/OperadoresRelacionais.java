package Introdução.Aula04Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        // Operadores aritméticos:
        // % = operador de resto de divisão (identifica se é par ou ímpar).
        // Com valores pares resultado será ZERO
        int restoPar = 20 % 2;

        // Com valores pares resultado será UM
        int restoImpar = 23 % 2;

        System.out.println("Divisão de valor par: "+restoPar);
        System.out.println("Divisão de valor ímpar: "+restoImpar);

        // Operadores lógicos (retornam valores booleanos):
        // > (maior que) < (menor que)
        // >= (maior ou igual que) <= (menor ou igual que)
        // == (equivale a igualdade) e != (equivale a desigualdade)

        // Nome da variável pretende agilizar entendimento, procurar mais informações...
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezDiferenteVinte: "+isDezDiferenteVinte);

        // Comparações só serve para tipos iguais, comparáveis.
    }
}

// Dúvida: e se usarmos valores ímpares e tivermos uma divisão exata?? (21/7=3)
// Procurar mais informações sobre isso, pois associar esse operador apenas a números
// - pares pode ser perigoso ....

