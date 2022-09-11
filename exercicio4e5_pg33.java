//Alexsandra Oliveira e Isadora Oliveira 3.54
//Exercícios 4 e 5 página 33.

import java.util.Scanner; 

public class exercicio4e5 {
    public static void main(String[] args) {
        float valorhora, horastrabalhadas, salario; 
        Scanner Ler = new Scanner(System.in); 

        System.out.print("Digite o valor das horas trabalhadas: ");
        valorhora = Ler.nextFloat();
        System.out.print("Digite o número de horas trabalhadas: ");
        horastrabalhadas = Ler.nextFloat();
        
        salario = (horastrabalhadas * valorhora); 
        
        if (salario < 50){ 
            System.out.println("Salário é infeiror a 50 reais.");
            System.out.println("Dirija-se em direção ao Hotel.");
        }else{
            System.out.println("Salário: " + salario); 
        }
        Ler.close(); 
    }
}