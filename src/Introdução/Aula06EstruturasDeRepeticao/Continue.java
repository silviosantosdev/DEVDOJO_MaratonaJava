package Introdução.Aula06EstruturasDeRepeticao;

public class Continue {

    // Dado o valor de um veículo, descubra em quantas vezes ele pode ser parcelado.
// Condição da parcelas: >=1000

    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;

            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " no valor de R$ " + valorParcela);
        }
    }
}