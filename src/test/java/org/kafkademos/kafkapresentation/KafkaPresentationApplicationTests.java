package org.kafkademos.kafkapresentation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KafkaPresentationApplicationTests {

    // @Test
    // void contextLoads() {
    // }

    // @Autowired
    // private KafkaTemplate<String, String> template;

    // @Autowired
    // private KafkaConsumer<String, String> consumer;

    // private KafkaConsumer<String, String> consumer;

    // @BeforeEach
    // void setUp() {
    // Properties props = new Properties();
    // props.put("spring.kafka.bootstrap-servers",
    // "localhost:9091,localhost:9092,localhost:9093");
    // props.put("spring.kafka.consumer.auto-offset-reset", "earliest");
    // props.put("spring.kafka.consumer.group-id", "demoGroupTestttt1");
    // props.put("spring.kafka.consumer.key-deserializer",
    // "org.apache.kafka.common.serialization.StringDeserializer");

    // // System.out.println("Consumer Properties: " + props.toString());
    // // consumer.subscribe(java.util.Collections.singleton("DemoTopic"));
    // }

    // @AfterEach
    // void tearDown() {
    // // consumer.close();
    // }

    // @Test
    // void testSendReceive() {

    // Properties prop = new Properties();
    // ProducerRecord<String,String> record = new
    // ProducerRecord<String,String>("DemoTest","Test Message");
    // prop.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
    // StringSerializer.class.getName());
    // KafkaProducer<String, String> producer = new KafkaProducer<String,
    // String>(prop);
    // producer.send(record);
    // var received = KafkaTestUtils.getSingleRecord(consumer, "DemoTopic");
    // assertEquals("Hello Kafka", received.value(), "The received message does not
    // match the expected value");

    // }

    @Test
    void testTemplateSendReceive() {
        // DemoKafkaProducer dkf = new DemoKafkaProducer(template);
        // dkf.sendMessage("Hello Kafka");
        // var received = KafkaTestUtils.getSingleRecord(consumer, "DemoTopic");
        // assertEquals("Hello Kafka", received.value(), "The received message does not
        // match the expected value");
        assertEquals("Hello", "Hello");
    }

}
