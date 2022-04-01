package Introdução.Aula07Arrays;

public class ArraysMultidimensionais3 {
    public static void main(String[] args) {
        int[] [] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for(int [] arrayBase: arrayInt){
            for(int num: arrayBase) {
                System.out.println(num);
            }
        }
    }
}

// vou precisar rever isso com Loyane ou investir em coleções...
