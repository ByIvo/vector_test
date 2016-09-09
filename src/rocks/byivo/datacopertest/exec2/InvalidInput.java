package rocks.byivo.datacopertest.exec2;

public class InvalidInput extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidInput(Integer invalidInput) {
		super(String.format("O número %1$d informado é inválido! Por favor, informe um múltiplo de 10 entre 10 e 1000.", invalidInput));
	}

}
