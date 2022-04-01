package Introdução.Aula05EstruturasCondicionais;

public class VariasCondicoes {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >=18 categoria adulto

        int idade = 50;
        String categoria;

        //Opção 01:
        if(idade < 15){
            System.out.println("Categoria infantil");
        }else if(idade >=15 && idade < 18){
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria adulto");
        }

        //Opção 02 (refatorada):
        if(idade < 15){
            categoria = "Categoria infantil";
        }else if(idade >=15 && idade < 18){
            categoria = "Categoria juvenil";
        }else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);


    }
}
