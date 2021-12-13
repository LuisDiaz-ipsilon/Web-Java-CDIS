import java.util.Scanner;

public class app {

	//nombre, edad, estado civil, sexo
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		boolean sn = true; // Declaramos la variable centinela
		
		String info[][] = new String[100][100]; // Declaramos e Inicializamos la matriz
		
		Scanner input = new Scanner(System.in); //Creamos un objeto tipo Scanner para los inputs
		
		// Declaramos todas las variables contadoras necesarias
		int i = 0, sumaEdad = 0, contH = 0, contM = 0;
		int HCasado = 0, HSoltero = 0, MCasada = 0, MSoltera = 0;
		
		// Ciclo while, se repite hasta maximo 100 veces
		while(sn) { //Se repite mientras sn == true
		
		// Se imprime el numero de la persona en que va
		System.out.println("");// Espacio de decoracion
		System.out.println("Persona #"+(i+1)+": ");
		System.out.println(""); // Espacio de decoracion
		
		// Pregunta el nombre
		System.out.print("Ingrese el nombre: ");
		info[i][0]=input.nextLine(); // Almacena el nombre
		
		// Pregunta la edad
		System.out.print("Ingrese la edad: ");
		info[i][1]=input.nextLine();// Almacena la edad
		
		// Almacena la suma total de las edades, necesarias para calcular el promedio
		sumaEdad = sumaEdad + Integer.parseInt(info[i][1]); // castea un string a integer
		
		// Preguna el estado civil
		System.out.print("Ingrese el estad civil: ");
		info[i][2]=input.nextLine(); // Almacena el estado civil
		
		// Se crea una variable que solo se usara dentro del while llamada estadCivil
		// se iguala a la cadena ingresada de estado civil pero en minusculas
		String estadoCivil = info[i][2].toLowerCase();

		// Pregunta el sexo
		System.out.print("Ingrese el sexo (M/H): ");
		info[i][3]=input.nextLine(); // Almacena el sexo
		
		// Se crea una variable que solo se usara dentro del while llamada MH
		// se iguala a la cadena ingresada de sexo pero en minusculas
		String MH = info[i][3].toLowerCase();
		

		//verificas si la persona actual es hombre o mujer
		if(MH.equals("m")) {
			contM = contM + 1; // Aumenta contador de mujeres
			
			// verifica el estado civil de la persona actual
			if(estadoCivil.equals("casada")) MCasada = MCasada + 1; // Aumenta contador de mujeres casadas
			else if(estadoCivil.equals("soltera")) MSoltera = MSoltera + 1; // Aumenta contador de mujeres solteras
		}
		
		else if(MH.equals("h")) {
			contH = contH + 1; // Aumenta contador de hombres
			
			// verifica el estado civil de la persona actual
			if(estadoCivil.equals("casado")) HCasado = HCasado + 1;// Aumenta contador de hombres casados
			else if(estadoCivil.equals("soltero")) HSoltero = HSoltero + 1; // Aumenta contador de hombres solteros
			
		}
		
		System.out.println("");// Espacio de decoracion
		// Pregunta si se desea ingresar a alguien mas
		System.out.print("Desea ingresar otra persona (S/N): ");
		
		// Se declara variable que solo se usara dentro del while
		String centinela  = input.nextLine(); // almacena la string en centinela
		
		// iguala centinela a su contenido en minusculas
		centinela = centinela.toLowerCase();
		
		// Verifica si el usuario quiere continuar
		// Si ingresa "n" o "N" el while se detendra
		if(centinela.equals("n")) {
			sn = false; // Hace sn == false, terminando el ciclo
			System.out.println("LLENADO DE PERSONAS COMPLETADO");
		}
		System.out.println(""); // Espacio de decoracion
		
		
		i = i + 1; // incrementa i conforme el numero de personas capturadas
		}
		
		// Imprime el total de personas capturadas
		System.out.println("Total de personas capturadas: "+i);
		
		// Imprime el promedio de la edad de personas capturadas
		System.out.println("Promedio de edad de personas capturadas: " + sumaEdad/i);

		// Imprime el porcentaje de hombres
		System.out.println("Porcentaje de hombres: " + (float)contH*100/i + "%");
		
		// Imprime el porcentaje de mujeres
		System.out.println("Porcentaje de mujeres: " + (float)contM*100/i + "%");
		
		//Verifica si al menos hay un hombre y una mujer de las personas capturadas
		if(contH > 0 && contM > 0) {
			
			// Imprime el porcentaje de hombres y mujeres casados
			System.out.println("Hombres casados: "+ (float)HCasado*100/contH +"%" + " Mujeres casadas: "+ (float)MCasada*100/contM+"%");
			
			// Imprime el porcentaje de hombres y mujeres solteros
			System.out.println("Hombres solteros: "+ (float)HSoltero*100/contH+"%" + " Mujeres solteras: "+ (float)MSoltera*100/contM+"%");
		}
		
		// Verifica si el numero de hombres capturados es cero
		// Esto evita la division entre cero
		if(contM == 0) {
			
			// Imprime el porcentaje de hombres casados
			System.out.println("Hombres casados: "+ (float)HCasado*100/contH +"%" + " Mujeres casadas: "+"0.0%");
			
			// Imprime el porcentaje de hombres solteros
			System.out.println("Hombres solteros: "+ (float)HSoltero*100/contH+"%" + " Mujeres solteras: "+"0.0%");
		}
		
		// Verifica si el numero de mujeres capturadas es cero
		// Esto evita la division entre cero
		if(contH == 0) {
			
				// Imprime el porcentaje de mujeres casadas
				System.out.println("Hombres casados: "+"0.0%" + " Mujeres casadas: "+ (float)MCasada*100/contM+"%");
			
				// Imprime el porcentaje de mujeres solteras
				System.out.println("Hombres solteros: "+"0.0%" + " Mujeres solteras: "+ (float)MSoltera*100/contM+"%");
				
				
		}	
	}
}
