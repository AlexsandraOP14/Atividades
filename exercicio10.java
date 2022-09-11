//Alexsandra Oliveira e Isadora Oliveira 3.54
//Exercicio 10

import java.util.Scanner; 

public class exercicio10 { 

    private static int numero, antecessor;

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in); 
        System.out.println("Digite um número: "); 
        numero = ler.nextInt();
        antecessor = ( numero - 1);
        System.out.println("O antecessor de "+ numero +" é "+ antecessor+ "!");
        
        ler.close();

    }
}