public class Main05 {
    public static void main(String[] args) {

        //idade < 15 = infantil / idade <=17 = juvenil / idade >=18 = adulto//

          int idade = 17;
          if(idade>=18){
            System.out.println("Categoria Adulto.");
          }
          else if (idade<=17){
            System.out.println("Categoria Juvenil.");
          }

          else if(idade<15){
            System.out.println("Categoria Infantil");
          }
        
    }
}
