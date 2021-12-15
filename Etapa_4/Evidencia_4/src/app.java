import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Se declaran e inicializan los arreglos de objetos
		Empleado emp[] = new Empleado[100];
		Programador pro[] = new Programador[100];
		
		// Se crea un objeto tipo scanner para los input
		Scanner input = new Scanner(System.in);	
		
		// se declaran e inicializan las variables necesarias
		boolean sn = true;
		int contEmp = 0;
		int contPro = 0;
		
		// ciclo que se repite las veces que el usuario desee
		while(sn) {
			
				System.out.println("\n1.- Empleado\n2.- Programador\n Ingrese cualquier otro caracter para salir");
				System.out.print("Que desea capturar: ");
				String type = input.nextLine();
				
				switch(type) {
				
				case "1":
					Empleado e = new Empleado();
					System.out.println("Empleado #"+(contEmp+1));
					System.out.print("Ingrese el nombre: ");
					String nombre = input.nextLine();
					e.setNombre(nombre);
					
					System.out.print("Ingrese la cedula: ");
					String cedula = input.nextLine();
					e.setCedula(cedula);
					
					System.out.print("Ingrese la edad: ");
					int edad = input.nextInt(); input.nextLine();
					e.setEdad(edad); 
					
					System.out.print("Ingrese estado civil: ");
					String estadoCivil = input.nextLine();
					e.setEstadoCivil(estadoCivil);
					
					System.out.print("Ingrese salario: ");
					double salario = input.nextDouble(); input.nextLine();
					e.setSalario(salario);
					
					emp[contEmp] = e;
					
					contEmp++;
					
					break;
					
				case "2":
					
					Programador p = new Programador();
					
					System.out.println("Programador #"+(contEmp+1));
					System.out.print("Ingrese el nombre: ");
					String nombreP = input.nextLine();
					p.setNombre(nombreP);
					
					System.out.print("Ingrese la cedula: ");
					String cedulaP = input.nextLine();
					p.setCedula(cedulaP);
					
					System.out.print("Ingrese la edad: ");
					int edadP = input.nextInt(); input.nextLine();
					p.setEdad(edadP); 
					
					System.out.print("Ingrese estado civil: ");
					String estadoCivilP = input.nextLine();
					p.setEstadoCivil(estadoCivilP);
					
					System.out.print("Ingrese salario: ");
					double salarioP = input.nextDouble(); input.nextLine();
					p.setSalario(salarioP);
					
					System.out.print("Ingrese lineas de codigo por hora: ");
					int lineasDeCodigo = input.nextInt(); input.nextLine();
					p.setLineasDeCodigoPorHora(lineasDeCodigo);
					
					
					System.out.print("Ingrese lenguaje dominante: ");
					String lenguajeDominante = input.nextLine();
					p.setLenguajeDominante(lenguajeDominante);
					
					pro[contPro] = p;
					
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

		System.out.println("\nLista de empleados\n");
		for(int i=0; i<contEmp; i++) {
			System.out.println("Empleado #"+(i+1)+": ");
			emp[i].imprimir();
			System.out.print("\n");
		}
		
		System.out.println("\nLista de programadores\n");
		for(int i=0; i<contPro; i++) {
			System.out.println("Programador #"+(i+1)+": ");
			pro[i].imprimir();
			System.out.print("\n");
		}
		
		// print que se ejecuta si el programa esta por terminar
		System.out.println("\n\nPROGRAMA FINALIZADO");
	}

}
