package org.kafkademos.kafkapresentation;

import java.util.stream.IntStream;

import org.kafkademos.kafkapresentation.lib.RandomStringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaPresentationApplication {

    private final int TOTAL_TO_SEND = 1000;
    private final int THROTTLE_DELAY = 1000;
    private final RandomStringService randomStringService;

    public static void main(String[] args) {
        SpringApplication.run(KafkaPresentationApplication.class, args);

    }

    @Autowired
    public KafkaPresentationApplication(RandomStringService randomStringService) {
        this.randomStringService = randomStringService;
    }

    @Bean
    CommandLineRunner commandLineRunner(DemoKafkaProducer producer) {
        return args -> {
            IntStream.range(0, TOTAL_TO_SEND).forEach(i -> {
                producer.sendMessage(randomStringService.generateRandomString(64));
                try {
                    Thread.sleep(THROTTLE_DELAY);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            });
        };
    }

}
