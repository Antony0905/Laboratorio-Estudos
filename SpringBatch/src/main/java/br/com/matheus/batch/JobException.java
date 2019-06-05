package br.com.matheus.batch;

/**
 * Excecao a ser disparada sempre que ocorrer um erro durante as fases de um
 * job.
 * 
 * @author Everis - Fabio Borges de Oliveira Vilela
 * @since 26/09/2017
 */
public class JobException extends Exception {

	/**
	 * Serial Version Defaul.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construtor padrao
	 */
	public JobException() {

		super();
	}

	/**
	 * Exception com tres parametros e um Throwable
	 * 
	 * @param arg0 String
	 * @param arg1 Throwable
	 * @param arg2 boolean
	 * @param arg3 boolean
	 */
	public JobException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {

		super(arg0, arg1, arg2, arg3);
	}

	/**
	 * Exception com um parametro e um Throwable
	 * 
	 * @param arg0 String
	 * @param arg1 Throwable
	 */
	public JobException(String arg0, Throwable arg1) {

		super(arg0, arg1);
	}

	/**
	 * Exception com um parametro
	 * 
	 * @param arg0 String
	 */
	public JobException(String arg0) {

		super(arg0);
	}

	/**
	 * Exception com um Throwable
	 * 
	 * @param arg0 Throwable
	 */
	public JobException(Throwable arg0) {

		super(arg0);
	}
}
