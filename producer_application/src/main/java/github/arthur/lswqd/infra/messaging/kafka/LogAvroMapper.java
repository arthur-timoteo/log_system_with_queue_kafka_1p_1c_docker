package github.arthur.lswqd.infra.messaging.kafka;

import com.resources.avro.SchemaGeneralLog;
import github.arthur.lswqd.entities.Log;
import org.springframework.stereotype.Component;

@Component
public class LogAvroMapper {

    public SchemaGeneralLog toAvro(Log log) {
        return SchemaGeneralLog.newBuilder()
                .setId(log.getId())
                .setSolution(log.getSolution())
                .setApplication(log.getApplication())
                .setTypeLog(log.getTypeLog())
                .setTitle(log.getTitle())
                .setPath(log.getPath())
                .setMessage(log.getMessage())
                .setTimestamp(log.getTimestamp().toString())
                .build();
    }
}
