public class Main09 {
    public static void main(String[] args) {

        int ValorMax = 50;
        for(int i=0; i<=ValorMax; i++){
            if(i>25){
                break;
            }
            System.out.println(i);
            
        }

        //Exercício de Break//

        double valorTotal = 30000;

        for(int Parcela=1; Parcela<=valorTotal;Parcela++){
            double valorParcela = valorTotal / Parcela;
            if (valorParcela >=1000) {
                  System.out.println("Quantidade de vezes: " +Parcela+ " Valor da parcela em R$: "+valorParcela);
            }
            else{
                break;
            }
          
        }
        
    }
}
