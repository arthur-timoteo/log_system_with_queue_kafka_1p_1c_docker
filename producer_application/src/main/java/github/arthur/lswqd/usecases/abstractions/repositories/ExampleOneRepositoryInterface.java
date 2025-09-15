package github.arthur.lswqd.usecases.abstractions.repositories;

import github.arthur.lswqd.entities.ExampleOneEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleOneRepositoryInterface {
    ExampleOneEntity save(ExampleOneEntity object);
}
