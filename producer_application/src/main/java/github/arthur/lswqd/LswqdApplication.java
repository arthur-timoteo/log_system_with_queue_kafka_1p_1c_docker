package github.arthur.lswqd;

import github.arthur.lswqd.infra.kafka.LogProducerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LswqdApplication {
	private static LogProducerService _logProducerService;

	public LswqdApplication(LogProducerService producerService) {
		this._logProducerService = producerService;
	}

	public static void main(String[] args) {

		SpringApplication.run(LswqdApplication.class, args);
		_logProducerService.sendMessage("opa");
	}

}
