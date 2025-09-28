package github.arthur.lswqd.infra.messaging.kafka;

import com.resources.avro.SchemaGeneralLog;
import github.arthur.lswqd.entities.Log;
import github.arthur.lswqd.usecases.abstractions.LoggerInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LogProducerService implements LoggerInterface {

    @Value("${app.kafka.topic}")
    private String topic;
    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final LogAvroMapper logAvroMapper;

    public LogProducerService(KafkaTemplate<String, Object> kafkaTemplate, LogAvroMapper logAvroMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.logAvroMapper = logAvroMapper;
    }

    @Override
    public void log(Log log) {
        SchemaGeneralLog logAvro = logAvroMapper.toAvro(log);
        kafkaTemplate.send(topic, logAvro);
    }
}
