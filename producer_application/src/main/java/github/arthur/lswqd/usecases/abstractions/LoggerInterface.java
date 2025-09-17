package github.arthur.lswqd.usecases.abstractions;

import github.arthur.lswqd.entities.Log;
import org.springframework.stereotype.Service;

@Service
public interface LoggerInterface {
    void log(Log log);
}
