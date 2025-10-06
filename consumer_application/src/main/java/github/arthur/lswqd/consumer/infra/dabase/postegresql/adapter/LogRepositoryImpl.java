package github.arthur.lswqd.consumer.infra.dabase.postegresql.adapter;

import github.arthur.lswqd.consumer.domain.Log;
import github.arthur.lswqd.consumer.domain.repository.LogRepositoryInterface;
import github.arthur.lswqd.consumer.infra.dabase.postegresql.entity.LogEntityMapper;
import github.arthur.lswqd.consumer.infra.dabase.postegresql.repository.LogRepositoryJPA;
import org.springframework.stereotype.Component;

@Component
public class LogRepositoryImpl implements LogRepositoryInterface {
    private final LogRepositoryJPA logRepositoryJPA;

    public LogRepositoryImpl(LogRepositoryJPA logRepositoryJPA) {
        this.logRepositoryJPA = logRepositoryJPA;
    }

    @Override
    public void save(Log log) {
        logRepositoryJPA.save(LogEntityMapper.toEntity(log));
    }
}
