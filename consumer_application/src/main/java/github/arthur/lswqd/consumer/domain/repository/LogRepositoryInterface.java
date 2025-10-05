package github.arthur.lswqd.consumer.domain.repository;

import github.arthur.lswqd.consumer.domain.Log;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepositoryInterface{
    void save(Log log);
}
