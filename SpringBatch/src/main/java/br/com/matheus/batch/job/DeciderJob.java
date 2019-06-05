package br.com.matheus.batch.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.matheus.batch.decider.Decider;
import br.com.matheus.batch.tasklet.PrimeiraTasklet;
import br.com.matheus.batch.tasklet.QuartaTasklet;
import br.com.matheus.batch.tasklet.SegundaTasklet;
import br.com.matheus.batch.tasklet.TerceiraTasklet;

/**
 * @author Everis - Matheus Antony
 * @version 1.0
 * @since 17/12/2018
 */
@Component
public class DeciderJob {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private PrimeiraTasklet primeiraTasklet;
	@Autowired
	private SegundaTasklet segundaTasklet;
	@Autowired
	private TerceiraTasklet terceiraTasklet;
	@Autowired
	private QuartaTasklet quartaTasklet;

	public void launcher(String jobName, JobParameters parameters) throws JobExecutionAlreadyRunningException,
			JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {

		logger.info("JOB DECIDER");

		Step step1 = stepBuilderFactory.get("PrimeiraTasklet").tasklet(primeiraTasklet).build();
		Step step2 = stepBuilderFactory.get("SegundaTasklet").tasklet(segundaTasklet).build();
		Step step3 = stepBuilderFactory.get("TerceiraTasklet").tasklet(terceiraTasklet).build();
		Step step4 = stepBuilderFactory.get("QuartaTasklet").tasklet(quartaTasklet).build();

		Job job = jobBuilderFactory
				.get(jobName)
				.incrementer(new RunIdIncrementer())
				.flow(step1)
				.next(decider()).on("ABERTURA").to(step2)
				.from(decider()).on("*").to(step3).next(step4)
				.end()
				.build();
		jobLauncher.run(job, parameters);

	}

	@Bean
	public Decider decider() {
		return new Decider();
	}
}
