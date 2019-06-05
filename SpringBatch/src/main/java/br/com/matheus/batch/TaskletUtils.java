package br.com.matheus.batch;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.scope.context.ChunkContext;

/**
 * Classe responsavel por prover metodos a serem utilizados nas tasklets
 * 
 * @author bresende
 *
 */
public final class TaskletUtils {

	/**
	 * Construtor Padrao.
	 */
	private TaskletUtils() {

	}

	/**
	 * Metodo responsavel por retornar algum parametro desejado
	 * 
	 * @param chunkContext
	 * @param key
	 * @return
	 */
	public static Object getParameter(ChunkContext chunkContext, String key) {

		return chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().get(key);
	}

	/**
	 * Metodo responsavel por inserir algum parametro no contexto da execucao de um
	 * job
	 * 
	 * @param chunkContext
	 * @param key
	 * @param value
	 */
	public static void putParameter(ChunkContext chunkContext, String key, Object value) {

		chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put(key, value);
	}

	/**
	 * Metodo responsavel por alterar a propriedade ExitStatus
	 * 
	 * @param chunkContext
	 * @param status
	 */
	public static void setExitStatus(ChunkContext chunkContext, ExitStatus status) {

		chunkContext.getStepContext().getStepExecution().setExitStatus(status);
	}

	/**
	 * Metodo responsavel por verificar a existencia de um parametro no contexto da
	 * execucao de um job
	 * 
	 * @param chunckContext
	 * @param key
	 * @return
	 */
	public static boolean containsKey(ChunkContext chunckContext, String key) {

		return chunckContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext()
				.containsKey(key);
	}
}
