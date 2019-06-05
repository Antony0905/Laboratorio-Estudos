package br.com.matheus.batch.endpoint;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.matheus.batch.job.DeciderJob;
import br.com.matheus.batch.job.FluxoJob;

@RestController
public class JobRequestResource {

	@Autowired
	FluxoJob jobFluxo;

	@Autowired
	DeciderJob jobDecider;


	@GetMapping(value = "/")
	public void jobLauncher() {
		JobParameters parameters = new JobParametersBuilder().toJobParameters();
		String id = Double.toString(Math.random());

		try {
			jobFluxo.launcher(id, parameters);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GetMapping(value = "/decider")
	public void jobDecider() {
		JobParameters parameters = new JobParametersBuilder().toJobParameters();
		String id = Double.toString(Math.random());

		try {
			jobDecider.launcher(id, parameters);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
