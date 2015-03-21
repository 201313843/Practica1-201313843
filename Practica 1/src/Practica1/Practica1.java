package Practica1;

import java.io.*;
import java.util.Scanner;


public class Practica1 {
	
	public static void main(String[] args) {
			
		int nivel = 0; // for selection level
		int problem = 0; // for selection problem
			
		Scanner ss = new Scanner(System.in);
			
		// CILO PARA REGRESAR AL MENU INICIO, SOLICITA INGRESAR NIVEL
		do {
			DibujarMenu(1);
			nivel = ss.nextInt();
				
			//SELECCIONAR NIVEL
			switch(nivel){
				case 1:
						
					// CICLO PARA REGRESAR AL NIVEL 1
					do {
							
						DibujarMenu(2);
						problem = ss.nextInt();
						
						//NIVEL 1
						switch(problem){
							case 1: 
								Problema1();
								break;
							case 2:
								Problema2();
								break;
							case 3:
								Problema3();
								break;
							case 4:
								System.out.println("Problema 4");
								break;
							case 5:
								System.out.println("Problema 5");
								break;
							case 6:
								System.out.println("Problema 6");
								break;
							default:
								System.out.println("Ingrese un número de 0 a 6");
						}
					} while(problem != 0); 
					break;
					// TERMINA NIVEL 1
						
				case 2:
						
					//NIVEL 2
					do {
						DibujarMenu(3);
						problem = ss.nextInt();
						switch(problem){
							case 7:
								System.out.println("Problema 7");
								break;
							case 8:
								System.out.println("Problema 8");
								break;
							case 9:
								System.out.println("Problema 9");
								break;
							case 10:
								System.out.println("Problema 10");
								break;
							case 11:
								System.out.println("Problema 11");
								break;
							case 12:
								System.out.println("Problema 12");
								break;
							case 13:
								System.out.println("Problema 13");									break;
							case 14:
								System.out.println("Problema 14");
								break;
							case 15:
								System.out.println("Problema 15");
								break;
							default:
								System.out.println("Ingrese un número de 7 a 15 o 0 para salir");
						}
					} while(problem != 0);
				break;
				// TERMINA NIVEL 2
			}
		} while(nivel != 0); // SALIR DEL PROGRAMA
	} //FIN DEL MAIN
	
	//MENU DE OPCIONES
	public static void DibujarMenu(int m){
		if(m == 1){
			System.out.println("Ingrese el nivel que desea");
			System.out.println("Nivel [ 1 ]");
			System.out.println("Nivel [ 2 ]");
			System.out.println("Salir [ 0 ]");
		}
		if(m == 2){
			System.out.println("Ingrese el problema que desea ver");
			System.out.println("Problema [ 1 ]");
			System.out.println("Problema [ 2 ]");
			System.out.println("Problema [ 3 ]");
			System.out.println("Problema [ 4 ]");
			System.out.println("Problema [ 5 ]");
			System.out.println("Problema [ 6 ]");
			System.out.println("Salir [ 0 ]");
		}
		if(m == 3){
			System.out.println("Ingrese el problema que desea ver");
			System.out.println("Problema [ 7 ]");
			System.out.println("Problema [ 8 ]");
			System.out.println("Problema [ 9 ]");
			System.out.println("Problema [ 10 ]");
			System.out.println("Problema [ 11 ]");
			System.out.println("Problema [ 12 ]");
			System.out.println("Problema [ 13 ]");
			System.out.println("Problema [ 14 ]");
			System.out.println("Problema [ 15 ]");
			System.out.println("Salir [ 0 ]");
		}
	}
	
	//PROBLEMA 1
	public static void Problema1(){
		int c1 = 5, c2 = 5;
		for(int x = 0; x < 5; x++){
			for(int y = 1; y <= c1; y++){
				if(y >= c2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			c1 +=1; 
			c2 -=1;
			System.out.println();
		}
		
		//IMPRIME LA PIRAMIDE INVERTIDA
		c1=8;
		c2=2;
		for(int x = 0; x < 4; x++){
			for(int y = 1; y <= c1; y++){
				if(y >= c2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			c1 -=1; 
			c2 +=1;
			System.out.println();
		}
	}//FIN PROBLEMA 1
	
	//PROBLEMA 2
	public static void Problema2(){
		
		int[] nota = new int[6];
		int promedio = 0, suma = 0;
		Scanner n = new Scanner(System.in);
		System.out.println("Ingrese las nostas del estudiante");
		
		//BUCLE PARA INGRESAR LAS 6 NOTAS
		for(int x = 0; x <= 5; x++){
			
			do{
				System.out.print("Nota "+ (x+1) +": ");
				nota[x] = n.nextInt();
			} while(nota[x] < 0 || nota[x] > 100); //CONDICIONA LA NOTA MAYOR QUE 0 Y MENOR QUE 100
			
			suma += nota[x];
		}	
		promedio = suma/6;
		if(promedio>90) System.out.println("Su promedio es A");
		if(promedio>80 && promedio < 89) System.out.println("Su promedio es B");
		if(promedio>70 && promedio < 79) System.out.println("Su promedio es C");
		if(promedio>60 && promedio < 69) System.out.println("Su promedio es D");
		if(promedio<60) System.out.println("Su promedio es E");
	} //FIN PROBLEMA 2
	
	public static void Problema3(){
		String hora = " ", minutos = "";
		int min = 0, hor = 0;
		Scanner hr =  new Scanner(System.in);
		do{
			System.out.print("Ingrese la hora use el formato [hh:mm] :");
			hora = hr.next();
			hor = Integer.parseInt(hora.substring(0,2));
			min = Integer.parseInt(hora.substring(3,5));
		}while(hor > 24 || min > 59 || hora.length() != 5);
		System.out.println(hor);
		System.out.println(min);
		if(min < 10){
			minutos = "0";
		} else minutos = String.valueOf(min);
		if(hor > 12){
			hor = hor - 12;
			System.out.println("La hora es: " + hor + ":" + minutos + "p.m.");	
		} else{
			System.out.println("La hora es: " + hor + ":" + minutos + "a.m.");	
		}
	}// FIN PROBLEMA 3
	
} //FIN DE LA CLASE 
