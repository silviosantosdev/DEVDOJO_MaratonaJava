package Introdução.Aula05EstruturasCondicionais;

public class CondicaoIf {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // !
        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado comprar bebida alcoólica");
        }

        // if(!isAutorizadoComprarBebida) = outra maneira de escrever a expressão abaixo:
        if(isAutorizadoComprarBebida == false) {
            System.out.println("Não autorizado comprar bebida alcoólica");
        }


    }

}
