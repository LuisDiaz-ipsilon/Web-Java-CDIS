import java.util.ArrayList; // Libreria necesaria para crear ArrayList
import java.util.Scanner; // Librearia para crear objetos tipos Scanner

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Se crea un objeto tipo scanner para los input
		Scanner input = new Scanner(System.in);	
		
		// se declaran e inicializan las variables necesarias
		boolean sn = true; // variable centinela para el ciclo while
		int contEmp = 0;  // Contador de empleados
		int contPro = 0; // Contador de programadores
		
		// ArrayList tipo empleado, el cual contendre objetos de tipo empleado y programador
		// Como programador extiende de empleado el arrayList no tiene problema con guardar objetos tipo programador
		ArrayList <Empleado> empleados = new ArrayList<Empleado>();
		
		// ciclo que se repite las veces que el usuario desee
		while(sn) {
			
				// Pregunta si el usuario quere ingresar un empleado normal o programador
				System.out.println("\n1.- Empleado normal\n2.- Programador\n Ingrese cualquier otro caracter para salir");
				System.out.print("Que desea capturar: ");
				String type = input.nextLine();
				System.out.print("\n");
				switch(type) {
				
				case "1": // Caso para empleados normales
					Empleado e = new Empleado(); //Crea objeto tipo empleado
					
					System.out.println("Empleado #"+(contEmp+1));
					
					// Pide el nombre o los nombres del empleado
					System.out.print("Ingrese su nombre(s): ");
					String nombre = input.nextLine();
					
					// Pide los apellidos del empleado
					System.out.print("Ingrese sus apellidos: ");
					String apellidos = input.nextLine();
					
					// Almacena el nombre completo de el empleado en el objeto
					e.setNombre(nombre+" "+apellidos);
					
					// Pide la cedula del empleado
					System.out.print("Ingrese la cedula: ");
					String cedula = input.nextLine();
					e.setCedula(cedula); // Almacena la cedula de el empleado
					
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
					
					// Almacena la edad del empleado en el objeto
					e.setEdad(edad); 
					
					// Pide el estado civil de el empleado
					System.out.print("Ingrese estado civil: ");
					String estadoCivil = input.nextLine();
					
					// Almacena el estado civil de el empleado en el objeto
					e.setEstadoCivil(estadoCivil);
					
					// Pide el salario del empleado
					System.out.print("Ingrese salario: ");
					double salario = input.nextDouble(); input.nextLine();
					e.setSalario(salario); // almacena el salario
					
					// Agrega el objeto "e" al final del ArrayList empleados
					empleados.add(e);
					
					// Aumenta contador de empleados
					contEmp++;
					
					break;
					
				case "2": // Caso para programadores
					
					// Crea un objeto tipo programador
					Programador p = new Programador();
					
					System.out.println("Programador #"+(contEmp+1));
					
					// Pide el nombre o los nombres del programador
					System.out.print("Ingrese su nombre(s): ");
					String nombreP = input.nextLine();
					
					// Pide los apellidos del programador
					System.out.print("Ingrese sus apellidos: ");
					String apellidosP = input.nextLine();
					
					// almacena el nombre completo del programador en el objeto "p"
					p.setNombre(nombreP+" "+apellidosP);
					
					// Pide la cedula del programador
					System.out.print("Ingrese la cedula: ");
					String cedulaP = input.nextLine();
					p.setCedula(cedulaP); // Almacena la cedula en el objeto
					
					// Pide la edad del programador
					System.out.print("Ingrese la edad: ");
					int edadP = input.nextInt();
					
					//While para validar que la edad sea de 18 hasta 45
					while(edadP<18 || edadP>45) {
						// Pide la edad del programador de nuevo
						System.out.print("Ingrese la edad (entre 18 y 45 años): ");
						edadP = input.nextInt();
					}
					input.nextLine();
					
					// Almacena la edad en el objeto
					p.setEdad(edadP); 
					
					// Pide el estado civil de el programador
					System.out.print("Ingrese estado civil: ");
					String estadoCivilP = input.nextLine();
					// Almacena el estado civil del programador en el objeto
					p.setEstadoCivil(estadoCivilP);
					
					// Pide el salario del programador
					System.out.print("Ingrese salario: ");
					double salarioP = input.nextDouble(); input.nextLine();
					
					// Almacena el salario del programador en el objeto
					p.setSalario(salarioP);
					
					// Pide el numero de lineas de codigo por hora 
					System.out.print("Ingrese lineas de codigo por hora: ");
					int lineasDeCodigo = input.nextInt(); input.nextLine();
					
					// Almacena las lineas de codigo en el objeto
					p.setLineasDeCodigoPorHora(lineasDeCodigo);
					
					// Pide el lenguaje dominante del programador
					System.out.print("Ingrese lenguaje dominante: ");
					String lenguajeDominante = input.nextLine();
					
					// Almacena el lenguaje dominante del programador en el objeto
					p.setLenguajeDominante(lenguajeDominante);
					
					// Agrega el objeto "p" a el ArrayList empleados
					empleados.add(p);
					
					// Aumenta contador de programadores
					contPro++;
					
					break;
					
				default:
					// Se ejecuta si el usuario ingresa algo diferente de "1" o "2"
					// Termina el ciclo
					sn = false;
					break;
				}
			 
				
			// Se ejecuta si sn es true
			if(sn) {
				// Pregunta si se desea seguir capturando datos
				System.out.print("Desea seguir capturando datos? (S/N): ");
				String centinela = input.nextLine();
				centinela = centinela.toLowerCase(); // Se convierte a minusculas la string
				
				//se compara la respuesta, si el usuarios ingreso algo diferente de "S" o "s" el ciclo termina
				if(!centinela.equals("s")) {
					sn = false;
					System.out.println("\nCAPTURA DE DATOS FINALIZADA\n");
				}	
			}
			
			
			
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
