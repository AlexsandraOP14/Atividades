import java.util.Scanner;
import javax.swing.JOptionPane;
public class Emanuel{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        Integer idade;
        
        System.out.println("Qual a sua idade? ");
        idade = input.nextInt();

        System.out.println();

        if (idade <= 2){
            JOptionPane.showMessageDialog(null,"Você é um bebê!");   
        } else if ((idade > 2) && (idade <= 11)){
            JOptionPane.showMessageDialog(null,"Você é uma criança!");
        } else if ((idade > 11) && (idade <=19 )){
            JOptionPane.showMessageDialog(null,"Você é um adolescente!");
        } else if ((idade > 19) && (idade <= 30)){
            JOptionPane.showMessageDialog(null,"Você é um adulto!");
        } else if ((idade > 30) && (idade <= 60)){
            JOptionPane.showMessageDialog(null,"Você é um idoso!");
        }
    }


}