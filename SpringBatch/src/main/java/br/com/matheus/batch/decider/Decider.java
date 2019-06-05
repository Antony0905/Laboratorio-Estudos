package br.com.matheus.batch.decider;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;
import org.springframework.stereotype.Component;

@Component
public class Decider implements JobExecutionDecider {
	public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
		String status;
		String condition = "S";

		if (condition.equals("S")) {
			status = "ABERTURA";
		} else {
			status = "ATUALIZACAO";
		}
		return new FlowExecutionStatus(status);
	}
}
