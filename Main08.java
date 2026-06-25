public class Main08 {
    public static void main(String[] args) {
        int count = 0;

        while (count <10){
            System.out.println(++count);
        }


        for(int i=1; i<10;i++){
            System.out.println(i);
        }
        
        //Exercício de FOR//

        for(int i = 3; i<100001; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
