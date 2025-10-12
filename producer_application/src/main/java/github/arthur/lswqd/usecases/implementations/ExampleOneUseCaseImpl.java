package github.arthur.lswqd.usecases.implementations;

import github.arthur.lswqd.entities.ExampleOneEntity;
import github.arthur.lswqd.entities.Log;
import github.arthur.lswqd.usecases.abstractions.ExampleOneUseCaseInterface;
import github.arthur.lswqd.usecases.abstractions.LoggerInterface;
import github.arthur.lswqd.usecases.abstractions.repositories.ExampleOneRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class ExampleOneUseCaseImpl implements ExampleOneUseCaseInterface {

    private final ExampleOneRepositoryInterface exampleOneRepository;
    private final LoggerInterface logger;

    public ExampleOneUseCaseImpl (ExampleOneRepositoryInterface exampleOneRepository, LoggerInterface logger){
        this.exampleOneRepository = exampleOneRepository;
        this.logger = logger;
    }

    @Override
    public void execute(ExampleOneEntity objectExampleOneEntity) {
        try {
            logger.log(new Log("INFO", "Example One Use Case", "starting", "EOUCI-E-1"));

            var exampleOneEntity = exampleOneRepository.save(objectExampleOneEntity);

            int randomNumber = ThreadLocalRandom.current().nextInt(3);
            if(randomNumber == 2)
                throw new Exception("An error occurred while trying to execute use case number 1");

            logger.log(new Log("INFO", "Example One Use Case", "done", "EOUCI-E-2"));
        } catch (Exception e) {
            logger.log(new Log("ERROR", "Example One Use Case", e.toString(), "EOUCI-E-3"));
        }
    }
}
