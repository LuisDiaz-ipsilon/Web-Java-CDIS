import java.nio.BufferOverflowException;
import java.util.ArrayList; // Libreria necesaria para crear ArrayList
import java.util.InputMismatchException;
import java.util.Scanner; // Librearia para crear objetos tipos Scanner

import javax.swing.JOptionPane;

import Exceptions.EdadException;
import Exceptions.SalarioPositivoException;

public class app {

	public static void main(String[] args) throws EdadException, SalarioPositivoException {
		// TODO Auto-generated method stub
		
		// Se crea un objeto tipo scanner para los input
		Scanner input = new Scanner(System.in);	
		
		// se declaran e inicializan las variables necesarias
		boolean sn = true; // variable centinela para el ciclo while
		
		int totalEmpleados = 0;
		
		// ArrayList tipo empleado, el cual contendre objetos de tipo empleado y programador
		// Como programador extiende de empleado el arrayList no tiene problema con guardar objetos tipo programador
		ArrayList <Empleado> empleados = new ArrayList<Empleado>();
		
		// ciclo que se repite las veces que el usuario desee
		while(sn) {
			
			System.out.println("\nIngrese los datos del empleado #" + (totalEmpleados+1) + ":");
			
			// Pide el nombre o los nombres del empleado
			System.out.print("Ingrese su nombre(s): ");
			String nombre = input.nextLine();
			
			// Pide los apellidos del empleado
			System.out.print("Ingrese sus apellidos: ");
			String apellidos = input.nextLine();
			
			// Almacena el nombre completo de el empleado en el objeto
			
			// Pide la cedula del empleado
			System.out.print("Ingrese la cedula: ");
			String cedula = input.nextLine();
			
			/*
			// Pide la edad del empleado
			System.out.print("Ingrese la edad: ");
			int edad = input.nextInt();
			*/
			
			// while que validad que la edad sea de 18 hasta 45
			
			String edad = "";
			int edadInt = 0;
			boolean edadIsCorrect = false;

			// Ciclo que permitira volver a ingresar el salario en dado caso que salte una exception
			while(!edadIsCorrect) {
				
				// Variable necesarias para validar
				edadInt = 0;
				edadIsCorrect = true;
				
				System.out.print("Ingrese la edad: ");
				
				//codigo donde puede salta la exception
				
				try {
					
				// Pide la edad del empleado
				edad = input.nextLine();
				
				// Intruccion para verificar el formato de la edad
				edadInt = Integer.parseInt(edad);
				
				// Verifica que la edad sea de 18 a 45
				EdadException oEdadException = new EdadException(edadInt);
				
				} catch(EdadException err){ // Valida edad (18-45)
					
					//err.printStackTrace();
					System.out.println(err.getMessage());
					edadIsCorrect = false;
				}
				catch(NumberFormatException e) { // Valida que la edad sea entero
					
					// No use el InputMismatchException porque me ciclaba el while con el mensaje de error
					// en su lugar use el NumberFormatException el cual hace algo similar
					
					System.out.println("Solo ingrese numero enteros, favor de volver a ingresar la edad");
					edadIsCorrect = false;
				}
				
			}
			
			
			// Pide el estado civil de el empleado
			System.out.print("Ingrese estado civil: ");
			String estadoCivil = input.nextLine();
			
			boolean salarioIsCorrect = false;
			double salario = 0;
			
			// Ciclo que permitira volver a ingresar el salario en dado caso que salte una excepcion
			while(!salarioIsCorrect) {
				
				salarioIsCorrect = true;
				
				
					System.out.print("Ingrese salario: ");
					
				try {
					
					// Pide el salario del empleado
					String salario1 = input.nextLine();
					
					// Intruccion para verificar el formato del salario
					salario = Double.parseDouble(salario1);
					
					// Verifica que el salario sea mayor a cero
					SalarioPositivoException oSalarioException = new SalarioPositivoException(salario);
					
				}catch(InputMismatchException  e) { // OverflowException, evita que se ingrese una cantidad demasiado grande
					
					salarioIsCorrect = false;
					System.out.println("Ingrese cantidades coherentes");
					
				} catch(NumberFormatException e) { //FormatException, verifica que el salario sea un numero decimal
					
					// No use el InputMismatchException porque me ciclaba el while con el mensaje de error
					// en su lugar use el NumberFormatException el cual hace algo similar
					
					salarioIsCorrect = false;
					System.out.println("Solo ingrese numeros decimales");
					
				} catch(SalarioPositivoException exS) { // Valida que el salario sea mayor a cero
					
					salarioIsCorrect = false;
					System.out.println(exS.getMessage());
					
				}
				
			}
			
			
			
			System.out.print("\nEl empleado es un programador? (s/n): ");
			String centinela = input.nextLine();
			
			centinela = centinela.toLowerCase();
			
			if(centinela.equals("s") || centinela.equals("si")) {
				
				// Pide el numero de lineas de codigo por hora 
				System.out.print("\nIngrese lineas de codigo por hora: ");
				int lineasDeCodigo = input.nextInt(); input.nextLine();
				
				// Pide el lenguaje dominante del programador
				System.out.print("Ingrese lenguaje dominante: ");
				String lenguajeDominante = input.nextLine();
				
				//Creamos el objeto tipo programador
				Programador p = new Programador();
				
				//Seteamos los valores
				p.setNombre(nombre+" "+apellidos);
				p.setCedula(cedula);
				p.setEdad(edadInt);
				p.setEstadoCivil(estadoCivil);
				p.setSalario(salario);
				p.setLineasDeCodigoPorHora(lineasDeCodigo);
				p.setLenguajeDominante(lenguajeDominante);
				
				//Agregamos el objeto "p" a el arrayList de empleados
				empleados.add(p);
				
			}else {
				
				//Creamos el objeto tipo empleado
				Empleado e = new Empleado();
				
				//Seteamos los valores
				e.setNombre(nombre+" "+apellidos);
				e.setCedula(cedula);
				e.setEdad(edadInt);
				e.setEstadoCivil(estadoCivil);
				e.setSalario(salario);
				
				//Agregamos el objeto "e" a el arrayList de empleados
				empleados.add(e);
				
			}
				
			// Se ejecuta si sn es true
			if(sn) {
				// Pregunta si se desea seguir capturando datos
				System.out.print("\nDesea seguir capturando datos? (S/N): ");
				String centinela1 = input.nextLine();
				centinela1 = centinela1.toLowerCase(); // Se convierte a minusculas la string
				
				//se compara la respuesta, si el usuarios ingreso algo diferente de "S" o "s" el ciclo termina
				if(!centinela1.equals("s")) {
					sn = false;
					System.out.println("\nCAPTURA DE DATOS FINALIZADA\n");
				}	
			}
			
			//Aumenta el numero de empleados registrados
			totalEmpleados++;
			
		}
		
		int i = 0;
		
		// Imprime los datos de todos los empleados y programadores
		for(Empleado e: empleados) {
			System.out.println("Empleado #"+(i+1)+": ");
			e.imprimir();
			System.out.print("\n");
			i++;
		}
		
		// print que se ejecuta si el programa esta por terminar
		System.out.println("\n\nPROGRAMA FINALIZADO");
		
	}
	

}
