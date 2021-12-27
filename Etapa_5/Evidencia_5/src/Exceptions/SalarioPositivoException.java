package Exceptions;

public class SalarioPositivoException extends Exception {
	
	public static final long serialVersionUID = 700L;
	
	public SalarioPositivoException(String msg) {
		super(msg);
	}
	
	public SalarioPositivoException(double salario) throws SalarioPositivoException {
		this.validarSalario(salario);
	}
	
	public void validarSalario(double salario) throws SalarioPositivoException {
		if(salario <= 0) {
			throw new SalarioPositivoException("El salario debe ser positivo (mayor a cero), favor  de  capturar  nuevamente.");
		}
	}
	
}
