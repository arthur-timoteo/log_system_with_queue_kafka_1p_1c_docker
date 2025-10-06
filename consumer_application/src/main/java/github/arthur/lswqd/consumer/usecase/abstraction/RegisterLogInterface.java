package github.arthur.lswqd.consumer.usecase.abstraction;

import github.arthur.lswqd.consumer.domain.Log;
import org.springframework.stereotype.Service;

@Service
public interface RegisterLogInterface {
    void execute(Log log);
}
