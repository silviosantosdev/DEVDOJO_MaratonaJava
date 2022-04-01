package Introdução.Aula06EstruturasDeRepeticao;

public class Exercicio2 {

    // imprima os primeiros 25 números de um dado valor. (50)

    public static void main(String[] args) {

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++){
          if (i > 25) {
              break;
          }
            System.out.println("i = "+i);
        }
    }
}
