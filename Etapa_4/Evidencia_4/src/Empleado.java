
public class Empleado {
	
	// Atributos de la clase
	// el modificador de acceso es privado, por lo que no se podra acceder a estos fuera de esta clase
	private String nombre = "";
	private String cedula = "";
	private int edad = 0;
	private String estadoCivil = "";
	private double salario = 0;
	
	
	//Metodos get y set de cada uno de los atributos
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the estadoCivil
	 */
	public String getEstadoCivil() {
		return estadoCivil;
	}
	/**
	 * @param estadoCivil the estadoCivil to set
	 */
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	// Metodo imprimir, imprime todas las propiedades de la clase
	public void imprimir(){
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Cedula: "+this.cedula);
		System.out.println("Edad: "+this.edad);
		System.out.println("Estado civil: "+this.estadoCivil);
		System.out.println("Salario: "+this.salario);
		
		// Manda a llamar el metodo asignarClasificacion que esta declarado en esta misma clase
		this.asignarClasificacion(this.edad);
		
	}
	
	// Recibe la edad como parametro e imprime la clasificacion
	public void asignarClasificacion(int edad) {
		if(edad<= 21) System.out.println("Clasificacion: Principiante");
		else if(edad >= 22 && edad<=35) System.out.println("Clasificacion: Intermedio");
			else if(edad >35) System.out.println("Clasificacion: Senior"); 
	}
	
	

}
