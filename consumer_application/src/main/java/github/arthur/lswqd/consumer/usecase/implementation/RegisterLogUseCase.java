package github.arthur.lswqd.consumer.usecase.implementation;

import github.arthur.lswqd.consumer.domain.Log;
import github.arthur.lswqd.consumer.domain.repository.LogRepositoryInterface;
import github.arthur.lswqd.consumer.usecase.abstraction.RegisterLogInterface;
import org.springframework.stereotype.Service;

@Service
public class RegisterLogUseCase implements RegisterLogInterface {

    private final LogRepositoryInterface logRepository;

    public RegisterLogUseCase(LogRepositoryInterface logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public void execute(Log log) {
        logRepository.save(log);
    }
}
