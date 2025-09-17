package github.arthur.lswqd.infra.messaging.kafka;

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

    public LogProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void log(Log log) {
        kafkaTemplate.send(topic, log);
    }
}
