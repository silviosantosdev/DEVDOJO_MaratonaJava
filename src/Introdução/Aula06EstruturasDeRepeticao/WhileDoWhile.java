package Introdução.Aula06EstruturasDeRepeticao;

public class WhileDoWhile {

    public static void main(String[] args) {

        int count = 0;

        //while
        while(count < 10){
            System.out.println(++count);
        }do{
            System.out.println("Dentro do do-while");
        } while (count < 10);
    }
}
