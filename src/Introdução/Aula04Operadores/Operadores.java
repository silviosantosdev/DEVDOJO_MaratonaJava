package Introdução.Aula04Operadores;

public class Operadores {

    public static void main(String[] args) {
        int numero1 = 40;
        int numero2 = 20;
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;

        //para que valor da divisão seja decimal, é preciso que variáveis sejam double;

        double numero3 = 50;
        double numero4 = 30;
        double decimal = numero3 / numero4;

        System.out.println("Caso 01: valores são somados:");
        System.out.println(numero1+numero2);

        System.out.println("Caso 02: valores são concatenados:");
        System.out.println("Valor: "+numero1+numero2);

        System.out.println("Caso 03: soma e concatenação:");
        System.out.println(numero1+numero2+" Valores concatenados a seguir: "+numero1+numero2);

        System.out.println("Caso 04: resultado da operação em outra variável: soma= " +soma);
        System.out.println("Caso 05: resultado da operação em outra variável: soma= " +subtracao);
        System.out.println("Caso 06: resultado da operação em outra variável: soma= " +multiplicacao);
        System.out.println("Caso 07: resultado da operação em outra variável: soma= " +divisao);

        System.out.println("Caso 08: resultado da operação utilizando decimais: divisão= " +decimal);

        // é possível usar o casting para formato o valor como double dentro do SOUT, mas isso
        // não é considerado uma boa prática.

        System.out.println("Caso 09: resultado da operação utilizando 2 casas decimais:");
        System.out.printf("%.2f", +decimal);

        //ver se é possível inserir uma string, como nos casos anteriores, e ainda assim ter o
        //resultado em decimal. Ver se comando printf aceita strings.


    }

}
