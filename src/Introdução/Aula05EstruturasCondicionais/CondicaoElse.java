package Introdução.Aula05EstruturasCondicionais;

public class CondicaoElse {

    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado comprar bebida alcoólica");
        }else{
            System.out.println("Não autorizado comprar bebida alcoólica");
        }

    }

}
