package com.dummy.load.balancer.address.service.utils;

import java.security.SecureRandom;
import java.util.Random;

public class RandomIntegerGenerator {

    public static Integer generateRandomNumber(){
        Random random = new SecureRandom();
        return random.nextInt(99999, 99999999);
    }
}
