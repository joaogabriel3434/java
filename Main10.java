public class Main10 {
    public static void main(String[] args) {
         double valorTotal = 30000;

        for(int Parcela=1; Parcela<=valorTotal;Parcela++){
            double valorParcela = valorTotal / Parcela;
            if (valorParcela<=1000) {
                continue;
            }
            System.out.println("Quantidade de vezes: " +Parcela+ " Valor da parcela em R$: "+valorParcela);
        }
    }
}
