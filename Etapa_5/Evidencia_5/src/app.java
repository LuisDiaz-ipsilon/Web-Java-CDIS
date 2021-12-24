import java.util.ArrayList; // Libreria necesaria para crear ArrayList
import java.util.Scanner; // Librearia para crear objetos tipos Scanner

public class app {

	public static void main(String[] args) {
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
			
			// Pide la edad del empleado
			System.out.print("Ingrese la edad: ");
			int edad = input.nextInt();
			
			// while que validad que la edad sea de 18 hasta 45
			while(edad<18 || edad>45) {
				// Pide la edad del empleado de nuevo
				System.out.print("Ingrese la edad (entre 18 y 45 años): ");
				edad = input.nextInt();
			}
			input.nextLine();
			
			
			// Pide el estado civil de el empleado
			System.out.print("Ingrese estado civil: ");
			String estadoCivil = input.nextLine();
			

			
			// Pide el salario del empleado
			System.out.print("Ingrese salario: ");
			double salario = input.nextDouble(); input.nextLine();
			
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
				p.setEdad(edad);
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
				e.setEdad(edad);
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
