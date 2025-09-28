package github.arthur.lswqd.consumer.infra.messaging.kafka;

import com.resources.avro.SchemaGeneralLog;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LogConsumerService {

    @KafkaListener(topics = "${app.kafka.topic}", groupId = "${spring.kafka.listener.group-id}")
    public void consume(SchemaGeneralLog log) {
        System.out.println("📥 log received: " + log);
    }
}
