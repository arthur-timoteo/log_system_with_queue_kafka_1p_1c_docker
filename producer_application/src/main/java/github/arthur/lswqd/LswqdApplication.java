package github.arthur.lswqd;

import github.arthur.lswqd.entities.ExampleOneEntity;
import github.arthur.lswqd.usecases.abstractions.ExampleOneUseCaseInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class LswqdApplication {

	private static ExampleOneUseCaseInterface exampleOneUseCase;

	public LswqdApplication(ExampleOneUseCaseInterface exampleOneUseCase) {
		this.exampleOneUseCase = exampleOneUseCase;
	}

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(LswqdApplication.class, args);

		int executionsCount = 0;
		while (executionsCount < 20){
			exampleOneUseCase.execute(new ExampleOneEntity(1, "loren inpsum"));

			executionsCount++;
			Thread.sleep(ThreadLocalRandom.current().nextLong(5000, 15001));
		}
	}

}
