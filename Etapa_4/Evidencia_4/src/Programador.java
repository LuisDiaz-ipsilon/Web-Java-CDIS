
public class Programador extends Empleado {
	
	// Atributos de la clase
	// el modificador de acceso es privado, por lo que no se podra acceder a estos fuera de esta clase
	private int lineasDeCodigoPorHora = 0;
	private String lenguajeDominante = "";
	
	
	//Metodos get y set de cada uno de los atributos
	/**
	 * @return the lineasDeCodigoPorHora
	 */
	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}
	/**
	 * @param lineasDeCodigoPorHora the lineasDeCodigoPorHora to set
	 */
	public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}
	/**
	 * @return the lenguajeDominante
	 */
	public String getLenguajeDominante() {
		return lenguajeDominante;
	}
	/**
	 * @param lenguajeDominante the lenguajeDominante to set
	 */
	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}
	
	//Sobreescribe el metodo imprimir de la clase padre que es Empleado
	@Override // Anotacion que significa sobreescrito
	public void imprimir() {
		
		// Manda a llamar la funcion imprimir de la clase padre
		super.imprimir();
		
		// Imprime los atributos de la clase
		System.out.println("Lineas de codigo por hora: "+this.lineasDeCodigoPorHora);
		System.out.println("Lenguaje dominante: "+this.lenguajeDominante);
		
	}
	
}
