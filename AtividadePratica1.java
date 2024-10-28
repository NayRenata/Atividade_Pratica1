package atividade_generation1;

import java.util.Scanner;

public class AtividadePratica1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float salario;
        float abono;
        float NovoSal;
        

        System.out.println("Digite o seu salario: ");
        salario = ler.nextFloat();                
        
        System.out.println("Digite o seu abono: ");
        abono = ler.nextFloat();
                
        //Calculo do salario com o abono
        
        NovoSal = salario + abono; 
        
              
        System.out.println( "Parabéns, o seu novo salario é: " + NovoSal); 
        
          
     
        ler.close();
    }
}
