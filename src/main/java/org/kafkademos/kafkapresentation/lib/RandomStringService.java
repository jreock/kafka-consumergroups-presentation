package org.kafkademos.kafkapresentation.lib;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomStringService {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    private final Random random = new Random();

    public String generateRandomString(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            stringBuilder.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return stringBuilder.toString();
    }
}