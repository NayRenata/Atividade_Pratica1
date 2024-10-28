package atividade_generation;

import java.util.Scanner;

public class AtividadePratica4 {
 public static void main (String [] args){
 Scanner ler = new Scanner(System.in);
 
 float n1;
  float n2;
   float n3;
    float n4;
    float dif;
    
    System.out.println("Precisamos que voce informe quatro valores, informe o primeiro:");
    n1 = ler.nextFloat();
    
    System.out.println("Informe o segundo:");
    n2 = ler.nextFloat();
    
    System.out.println("Informe o terceiro:");
    n3 = ler.nextFloat();
    
    System.out.println("Informe o quarto:");
    n4 = ler.nextFloat();
    
    //Calculo da diferença
    
    dif = (n1 * n2) - (n3 * n4);
    
    System.out.println("A diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é:" +dif);
    
    ler.close();
    
    
    }
    }
