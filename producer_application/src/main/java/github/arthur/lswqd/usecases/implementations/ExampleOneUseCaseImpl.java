package github.arthur.lswqd.usecases.implementations;

import github.arthur.lswqd.entities.ExampleOneEntity;
import github.arthur.lswqd.entities.Log;
import github.arthur.lswqd.usecases.abstractions.ExampleOneUseCaseInterface;
import github.arthur.lswqd.usecases.abstractions.LoggerInterface;
import github.arthur.lswqd.usecases.abstractions.repositories.ExampleOneRepositoryInterface;
import org.springframework.stereotype.Service;

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
        var exampleOneEntity = exampleOneRepository.save(objectExampleOneEntity);

        Log log = new Log();
        log.setPath("loren impsun text");
        logger.log(log);
    }
}
