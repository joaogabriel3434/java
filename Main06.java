import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        double SalarioAnual = 70000;
        double PrimeiraFaixa = 9.70 / 100;
        double SegundaFaixa = 37.35 / 100;
        double TerceiraFaixa  = 49.50 / 100;
        double ValorImposto;

        if(SalarioAnual <=34712){
            ValorImposto = SalarioAnual * PrimeiraFaixa;
        }
        else if(SalarioAnual >= 34713 && SalarioAnual <=60507){
            ValorImposto = SalarioAnual * SegundaFaixa;
        }
        else{
            ValorImposto = SalarioAnual * TerceiraFaixa;
        }

        System.out.println("O valor de imposto que você paga por ano é de R$"+ValorImposto);
    }
}
