//Importamos para pedir inputs
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos e inicializamos la variable del radio
		int radio = 0;
		
		Scanner input = new Scanner(System.in);//creamos un objeto tipo scanner 
		
		//Pedimos el valor de el radio
		System.out.print("Ingresa el valor del radio: ");
		radio = input.nextInt(); //Almacenamos el valor del radio
		
		//Ejecutamos la funcion para calcular la circunferencia 
		//Pasamos el radio por parametro
		calcularCircunferencia(radio);
		
		//Ejecutamos la funcion para calcular el area 
		//Pasamos el radio por parametro
		calcularArea(radio);
	}
	
	//Funcion para calcular la circunferencia
	//Recibe un parametro de tipo int
	static void calcularCircunferencia(int r) {
		
		//Usamos la formula  2*pi*r para el perimetro/circunferencia
		double p = 2*3.1416*r;  
		
		//Imprimimos resultados
		System.out.println("Circunferencia: "+p); 
	}
	
	//Funcion para calcular el area
	//Recibe un parametro de tipo int
	static void calcularArea(int r) { // 
		
		//Usamos la formula pi*r^2 para el area
		double p = 3.1416*r*r;
		
		//Imprimimos resultados
		System.out.println("Area: "+p);
	}

}
