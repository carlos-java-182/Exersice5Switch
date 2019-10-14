package ejercicio5Switch;

import java.util.Scanner;

public class ejercicio5Switch 
{

	
	public static void main(String[] args) 
	{
		
		
		//Declaración de constantes
		
		
		//Declaración de variables
			
		int nMes=0;
		char respuesta = 's';
		
		
		
		//Construcción de objetos
		
		Scanner input = new Scanner(System.in);
		
		do 
	
		{
			
			
			nMes=0;
			//Validación de los datos de entrada
			while(nMes<=0)
			{
			
				System.out.println("Dame un numero de mes:");
				
				nMes = input.nextInt();
				
				if(nMes<=0){
					System.out.println("Dato inválido!!");
				}
			}
			
			switch(nMes)
			
			{
				case 1: System.out.println("Enero");
				break;
				
				case 2: System.out.println("Febrero");
				break;
				
				case 3: System.out.println("Marzo");
				break;
				
				case 4: System.out.println("Abril");
				break;
				
				case 5: System.out.println("Marzo");
				break;
				
				case 6: System.out.println("Junio");
				break;
				
				case 7: System.out.println("Julio");
				break;
				
				case 8: System.out.println("Agosto");
				break;
				
				case 9: System.out.println("Septiembre");
				break;
				
				case 10: System.out.println("Octubre");
				break;
				
				case 11: System.out.println("Nobiembre");
				break;
				
				case 12: System.out.println("Diciembre");
				break;
				
				default: System.out.println("Número de mes no válido");
				break;
				}
			
			System.out.println("Quieres visualizar otro mes?(s/n)");
			
			respuesta = input.next().charAt(0);
		}
			
		while (respuesta == 's');
		
			
		
		
	}
	}
