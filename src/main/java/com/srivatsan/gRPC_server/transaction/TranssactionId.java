package com.srivatsan.gRPC_server.transaction;

import java.security.SecureRandom;

public class TranssactionId {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int ID_LENGTH = 7;

    public static String generateTransactionId() {
        StringBuilder transactionId = new StringBuilder();
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < ID_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            transactionId.append(randomChar);
        }
        return transactionId.toString();
    }

}
