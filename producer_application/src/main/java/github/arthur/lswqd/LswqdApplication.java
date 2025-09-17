package github.arthur.lswqd;

import github.arthur.lswqd.entities.ExampleOneEntity;
import github.arthur.lswqd.usecases.abstractions.ExampleOneUseCaseInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LswqdApplication {

	private static ExampleOneUseCaseInterface exampleOneUseCase;

	public LswqdApplication(ExampleOneUseCaseInterface exampleOneUseCase) {
		this.exampleOneUseCase = exampleOneUseCase;
	}

	public static void main(String[] args) {
		SpringApplication.run(LswqdApplication.class, args);
		exampleOneUseCase.execute(new ExampleOneEntity(1, "loren inpsum"));
	}

}
