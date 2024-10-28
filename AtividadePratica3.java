package atividade_generation;

import java.util.Scanner;

public class AtividadePratica3 {
 public static void main (String [] args){
 Scanner ler = new Scanner(System.in);
 
 float bruto;
 float adicional = 500;
 float horaextra;
 float desconto = 200;
 float liquido;
 float folga = 50;
 
 System.out.println("Informe o seu salario bruto, por gentileza:");
 bruto = ler.nextFloat();
 
 System.out.println("Quantas horas extras foram realizadas este mes:");
 horaextra = ler.nextFloat();
 
 //Calculo do salario liquido
 
 liquido = bruto +adicional + (horaextra * 5) - desconto;
 
 if(folga <= horaextra){

System.out.println("O seu salario liquido este mes foi de: " +liquido+ " Suas horas extras estao acumuladas, voce deve tirar uma folga!");
}else{System.out.println("O seu salario liquido este mes foi de: " +liquido+ "sem folga este mes!");}


ler.close();



}
}
