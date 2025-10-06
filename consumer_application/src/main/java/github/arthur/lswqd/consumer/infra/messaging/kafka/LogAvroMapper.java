package github.arthur.lswqd.consumer.infra.messaging.kafka;

import com.resources.avro.SchemaGeneralLog;
import github.arthur.lswqd.consumer.domain.Log;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class LogAvroMapper {

    public static Log toDomain(SchemaGeneralLog logAvro){
        return new Log(
                logAvro.getId().toString(),
                logAvro.getSolution().toString(),
                logAvro.getApplication().toString(),
                logAvro.getTypeLog().toString(),
                logAvro.getTitle().toString(),
                logAvro.getPath().toString(),
                logAvro.getMessage().toString(),
                LocalDateTime.parse(logAvro.getTimestamp()));
    }
}
