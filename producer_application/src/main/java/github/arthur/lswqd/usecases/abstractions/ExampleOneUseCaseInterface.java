package github.arthur.lswqd.usecases.abstractions;

import github.arthur.lswqd.entities.ExampleOneEntity;
import org.springframework.stereotype.Service;

@Service
public interface ExampleOneUseCaseInterface {
    void execute(ExampleOneEntity object);
}
