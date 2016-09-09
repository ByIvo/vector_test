package rocks.byivo.datacopertest.exec2;

public class OutOfRange extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OutOfRange(Integer outRangedInput) {
		super(String.format("Por favor, informe apenas um múltiplo de 10 entre 10 e 1000.", outRangedInput));
	}

}
