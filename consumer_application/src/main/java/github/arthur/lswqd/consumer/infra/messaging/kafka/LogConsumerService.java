package github.arthur.lswqd.consumer.infra.messaging.kafka;

import com.resources.avro.SchemaGeneralLog;
import github.arthur.lswqd.consumer.domain.Log;
import github.arthur.lswqd.consumer.usecase.abstraction.RegisterLogInterface;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LogConsumerService {

    private final RegisterLogInterface registerLogUseCase;

    public LogConsumerService(RegisterLogInterface _registerLogInterface){
        this.registerLogUseCase = _registerLogInterface;
    }

    @KafkaListener(topics = "${app.kafka.topic}", groupId = "${spring.kafka.listener.group-id}")
    public void consume(SchemaGeneralLog logAvro) {
        System.out.println("📥 log received: " + logAvro);

        Log log = LogAvroMapper.toDomain(logAvro);
        registerLogUseCase.execute(log);
    }
}
