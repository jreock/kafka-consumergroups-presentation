package org.kafkademos.kafkapresentation;

import java.util.UUID;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class DemoKafkaProducer {

    private KafkaTemplate<String, String> kafkaTemplate;

    public DemoKafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        this.kafkaTemplate.send("DemoTopic", wrapMessage(message));
    }

    public String wrapMessage(String message) {
        String uuid = UUID.randomUUID().toString();
        long timestamp = System.currentTimeMillis();
        return "|| [%s] [%s] %s".formatted(timestamp, uuid, message);
    }
}