import java.util.Scanner;

public class app {

	//nombre, edad, estado civil, sexo
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//int n = 0; // Declaramos e inicializamos la variable n
		
		boolean sn = true;
		
		String info[][] = new String[100][100]; // Declaramos e Inicializamos la matriz
		
		Scanner input = new Scanner(System.in); //Creamos un objeto tipo Scanner para los inputs
		/*
		// Preguntamos la cantidad de personas
		System.out.print("Ingrese la cantidad de personas: ");
		n = input.nextInt(); //Almacenamos el valor
		
		input.nextLine(); // Arregla el problema de tener un nextInt antes de un nextLine
		*/
		
		int i = 0, suma = 0, contH = 0, contM = 0;
		int HCasado = 0, HSoltero = 0, MCasada = 0, MSoltera = 0;
		
		// Ciclo while, se repite hasta maximo 100 veces
		while(sn) {
		
		// Se imprime el contador de personas
		System.out.println("");// Espacio de decoracion
		System.out.println("Persona #"+(i+1)+": ");
		System.out.println(""); // Espacio de decoracion
		
		// Pregunta el nombre
		System.out.print("Ingrese el nombre: ");
		info[i][0]=input.nextLine(); // Almacena el nombre
		
		// Pregunta la edad
		System.out.print("Ingrese la edad: ");
		info[i][1]=input.nextLine();// Almacena la edad
		suma = suma + Integer.parseInt(info[i][1]);
		
		// Preguna el estado civil
		System.out.print("Ingrese el estad civil: ");
		info[i][2]=input.nextLine(); // Almacena el estado civil
		

		// Pregunta el sexo
		System.out.print("Ingrese el sexo (M/H): ");
		info[i][3]=input.nextLine(); // Almacena el sexo
		String MH = info[i][3].toLowerCase();
		String estadoCivil = info[i][2].toLowerCase();

		if(MH.equals("m")) {
			contM = contM + 1;
			if(estadoCivil.equals("casada")) MCasada = MCasada + 1;
			else if(estadoCivil.equals("soltera")) MSoltera = MSoltera + 1;
		}
		
		else if(MH.equals("h")) {
			contH = contH + 1;
			if(estadoCivil.equals("casado")) HCasado = HCasado + 1;
			else if(estadoCivil.equals("soltero")) HSoltero = HSoltero + 1;
			
		}
		
		System.out.println("");// Espacio de decoracion
		System.out.print("Desea ingresar otra persona (S/N): ");
		String centinela  = input.nextLine();
		
		centinela = centinela.toLowerCase();
		
		if(centinela.equals("n")) {
			sn = false;
			System.out.println("LLENADO DE PERSONAS COMPLETADO");
		}
		System.out.println(""); // Espacio de decoracion
		
		
		i = i + 1;
		}
		
		
		System.out.println("Total de personas capturadas: "+i);
		System.out.println("Promedio de edad de personas capturadas: " + suma/i);
		//System.out.println();
		
		System.out.println("Porcentaje de hombres: " + (float)contH*100/i + "%");
		System.out.println("Porcentaje de mujeres: " + (float)contM*100/i + "%");
		if(contH > 0 && contM > 0) {
			System.out.println("Hombres casados: "+ (float)HCasado*100/contH +"%" + " Mujeres casadas: "+ (float)MCasada*100/contM+"%");
			System.out.println("Hombres solteros: "+ (float)HSoltero*100/contH+"%" + " Mujeres solteras: "+ (float)MSoltera*100/contM+"%");
		}
		if(contM == 0) {
		
			System.out.println("Hombres casados: "+ (float)HCasado*100/contH +"%" + " Mujeres casadas: "+"0.0%");
			System.out.println("Hombres solteros: "+ (float)HSoltero*100/contH+"%" + " Mujeres solteras: "+"0.0%");
		}
		if(contH == 0) {
				System.out.println("Hombres solteros: "+"0.0%" + " Mujeres solteras: "+ (float)MSoltera*100/contM+"%");
				System.out.println("Hombres casados: "+"0.0%" + " Mujeres casadas: "+ (float)MCasada*100/contM+"%");
		}

		
		
	}
	

}
