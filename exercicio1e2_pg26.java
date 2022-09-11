//Alexsandra Oliveira e Isadora Oliveira 3.54
//Exercícios 1 e 2 página 26.

import java.util.Scanner; 

public class exercicio1e2 { 

    private static float altura, base, basemaior, area; 

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in); 

        System.out.println("Digite a altura: "); 
        altura = ler.nextFloat();
        System.out.println("Digite a base menor: ");
        base = ler.nextFloat();
        System.out.println("Digite a base maior: ");
        basemaior = ler.nextFloat();

        area = ((altura * (base + basemaior)) / 2); 

        System.out.println("Área do trapézio (exata): " + area); 
        System.out.println("Área do trapézio (arredondada): " + Math.round(area));

        ler.close();

    }
}