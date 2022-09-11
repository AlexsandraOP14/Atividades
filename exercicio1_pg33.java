//Alexsandra Oliveira e Isadora Oliveira 3.54
//Exercício 1 página 33.


public class exercicio1 {
    public static void main(String[] args){
        int impar = 0;
        long par = 1; 
        int num;
      
        for(num = 0; num <= 30; num++) { 
          if((num % 2 == 1)) { 
            impar += num; 
          }else{
            par *= num; 
          }
       }        
       System.out.println("Multiplicação dos números pares: " + par);
       System.out.println("Soma dos números ímpares: " + impar);     
    }
}