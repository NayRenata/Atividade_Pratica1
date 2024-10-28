package atividade_generation1;

import java.util.Scanner;

public class AtividadePratica2 {
   public static void main (String [] args) {
     
     Scanner ler = new Scanner(System.in);
    

 float num1;
 float num2;
 float num3;
 float num4;
 float media;
 
 System.out.println("Informe a sua nota 1: ");
 num1 = ler.nextFloat();
 
 System.out.println("Informe a sua nota 2: ");
 num2 = ler.nextFloat();
 
 System.out.println("Informe a sua nota 3: ");
 num3 = ler.nextFloat();
 
 System.out.println("Informe a sua nota 4: ");
 num4 = ler.nextFloat();
 
 //Calculo da média
 media = (num1 + num2 + num3 + num4)/4;
 
 if(media > 5){
 
 System.out.println("Parabens, voce foi aprovado! A sua media das suas quatro notas foi: " + media); 
 }else{System.out.println("Reprovado!A sua media das suas quatro notas foi: " + media);}
 
 ler.close();
 


}
}