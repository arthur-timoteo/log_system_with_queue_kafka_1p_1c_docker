package github.arthur.lswqd.consumer.infra.dabase.postegresql.entity;

import github.arthur.lswqd.consumer.domain.Log;
import org.springframework.stereotype.Component;

import java.time.ZoneOffset;
import java.util.UUID;

@Component
public class LogEntityMapper {

    public static LogEntity toEntity(Log log){
        LogEntity logEntity = new LogEntity();

        logEntity.setId(UUID.fromString(log.getId()));
        logEntity.setSolution(log.getSolution());
        logEntity.setApplication(log.getApplication());
        logEntity.setTypeLog(log.getTypeLog());
        logEntity.setTitle(log.getTitle());
        logEntity.setPath(log.getPath());
        logEntity.setMessage(log.getMessage());
        logEntity.setTimestamp(log.getTimestamp().toInstant(ZoneOffset.UTC));

        return logEntity;
    }
}
