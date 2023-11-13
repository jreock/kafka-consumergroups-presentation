package org.kafkademos.kafkapresentation;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DemoKafkaConsumer {

    private int msgCount = 0;
    private final int CONSUMER_DELAY = 1100;

    // # Demonstrate Single Consumer - Connect Single Consumer with Consumer Group
    @KafkaListener(topics = "DemoTopic", groupId = "Consumer-Group-A")
    public void listenA1(String message) { procMesg("A::1", message); }
 
    // # Demonstrate Durable Subscription - Connect and Disconnect Consumer while processing messages
    // @KafkaListener(topics = "DemoTopic", groupId = "Durable-Consumer-A")
    // public void listenConsumerA(String message) { procMesg("Consumer-A", message); }

    // # Demonstrate Load Balancing Consumer Group A - Connnect Second Consumer-Group-A Consumer
    // @KafkaListener(topics = "DemoTopic", groupId = "Consumer-Group-A")
    // public void listenA2(String message) { procMesg("A::2", message); }

    // # Demonstrate One Consumer Per Topic Partition - Connect Third Consumer Group A Consumer with only Two Partitions
    // @KafkaListener(topics = "DemoTopic", groupId = "Consumer-Group-A")
    // public void listenA3(String message) { procMesg("A::3", message); }

    // # Demonstrate Pub/Sub with Two Consumer Groups A and B
    // @KafkaListener(topics = "DemoTopic", groupId = "Consumer-Group-B")
    // public void listenB1(String message) { procMesg("B::1", message); }

    // # Demonstrate Pub/Sub with Load Balancing Groups A and B
    // @KafkaListener(topics = "DemoTopic", groupId = "Consumer-Group-B")
    // public void listenB2(String message) { procMesg("B::2", message); }

    // Additional Methods
    public void procMesg(String grpId, String message) {
        msgCount++;
        try { 
            System.out.println("Received [%s] [%s] %s".formatted(msgCount,grpId,message));
            Thread.sleep(CONSUMER_DELAY);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}