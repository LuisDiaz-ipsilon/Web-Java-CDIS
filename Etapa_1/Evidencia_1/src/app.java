import java.util.Scanner; //Importamos esta libreria para poder utilizar la clase scanner
						  //la cual nos permite pedir valores a el usuario
						

public class app {

	public static void main(String[] args) { //Este es nuestro metodo main/principal
		
		// TODO Auto-generated method stub
		
		//Estas son nuestras variables primitivas
		String nombre = ""; //inicializamos la variable nombre
		int numInt = 0; //inicializamos la variable numInt
		double numDec = 0; //inicializamos la variable numDec
		
		Scanner input = new Scanner(System.in); //creamos un objeto tipo Scanner
		
		//Se pide al usuario ingresar su nombre
		System.out.print("Ingresa tu nombre: ");
		 nombre = input.nextLine(); //Se almacena en nombre
		
		 //Se pide al usuario ingresar un numero entero
		System.out.print("Ingresa un numero entero: ");
		 numInt = input.nextInt(); //Se almacena en numInt
		
		//Se pide al usuario ingresar un numero decimal
		System.out.print("Ingresa un numero decimal: ");
		 numDec = input.nextDouble(); //Se almacena en numDec
		
		//Imprimimos los resultados
		System.out.println("Hola "+nombre+", el resultado de la suma entre "
		+numInt+" y "+numDec+" es "+(numDec+numInt)); //Sumamos numDec y numInt sin necesidad de crear otra variable
		//Dejamos espacios en blanco al inicio y al final de cada concadenacion para 
		//que la cadena sea mas entendible, clara y limpia
		
	}

}
