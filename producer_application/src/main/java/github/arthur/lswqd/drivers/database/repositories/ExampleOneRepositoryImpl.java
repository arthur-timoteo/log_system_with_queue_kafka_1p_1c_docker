package github.arthur.lswqd.drivers.database.repositories;

import github.arthur.lswqd.entities.ExampleOneEntity;
import github.arthur.lswqd.usecases.abstractions.repositories.ExampleOneRepositoryInterface;
import org.springframework.stereotype.Repository;

@Repository
public class ExampleOneRepositoryImpl implements ExampleOneRepositoryInterface {

    @Override
    public ExampleOneEntity save(ExampleOneEntity object) {
        return new ExampleOneEntity();
    }
}
