package Introdução.Aula04Operadores;

public class OperadoresAtribuicao {
    public static void main(String[] args) {

        // = (igual) | += (maior ou igual) |
        // -= (menor ou igual) | *= vezes ou igual | /= (divisível por ou igual) | %=

        double bonus = 1800; //1800
        //modo 1:
        bonus = bonus + 1000; //2800

        //modo 2:
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        //
        int contador = 0;
        contador+= 1;
        contador++;
        contador--;
        ++contador;
        --contador; //ordem de atribuição do incremento altera o resultado da operação.


        System.out.println(contador);

    }
}
