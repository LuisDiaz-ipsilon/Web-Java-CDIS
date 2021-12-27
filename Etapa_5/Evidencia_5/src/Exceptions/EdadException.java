package Exceptions;

public class EdadException extends Exception {
	
	public static final long serialVersionUID = 700L;
		
	public EdadException(String msg) {
		super(msg);
	}
	
	public EdadException(int edad) throws EdadException {
		this.validarEdad(edad);
	}
	
	public void validarEdad(int edad) throws EdadException {
		if(edad<18 || edad>45) {
			throw new EdadException("La edad capturada no pertenece al rango permitido  (18  a  45  años),  favor  de  capturar  nuevamente.");
		}
	}
	

}
