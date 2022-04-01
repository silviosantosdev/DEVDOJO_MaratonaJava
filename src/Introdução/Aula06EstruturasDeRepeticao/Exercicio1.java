package Introdução.Aula06EstruturasDeRepeticao;

public class Exercicio1 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000

       //Modo 1:
       // for(int i = 0; i <= 1000000; i+=2){
       //     System.out.println(i);

        //Modo 2:
        for(int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
