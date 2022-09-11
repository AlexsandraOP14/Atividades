//Alexsandra Oliveira e Isadora Oliveira 3.54
//Exercício 6 página 33.


import java.util.Scanner; 

public class exercicio6 {
    public static void main(String[] args){
        float peso; 
        String tipodepeso;
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o peso em libras ou quilos: "); 
        peso = Ler.nextFloat();
        System.out.println("Digite o tipo de peso('l' = libras / '2' = quilos): ");
        tipodepeso = Ler.next();

        if (tipodepeso == "l"){
            System.out.println("Quilos: " + (peso - (peso * 2.2046)));
            System.out.println("Libras: " + peso * 2.2046); 
        }else{
            System.out.println("Libras: " + peso * 2.2046);
            System.out.println("Quilos: " + (peso - (peso * 2.2046)));
        }
        Ler.close();
    }
}