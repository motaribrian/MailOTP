package com.codewithmotari.mailotp;

import java.security.SecureRandom;

public class OTP {

SecureRandom random=new SecureRandom();
StringBuilder OTP;

public OTP(){
    OTP=new StringBuilder();
}
public OTP(int length) {
    try {
        OTP=new StringBuilder();
        OTP.append(generateOTP(length));

    } catch (IllegalAccessException e) {
        //throw new RuntimeException(e);
        System.out.println("please use a valid length");
    }
}

    public String generateOTP(int length) throws IllegalAccessException {
        if (length<=0 || length>10){
            //throw new IllegalAccessException("please use a positive integer");
            return "please input a valid length";
        }
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i <= length - 1; i++) {
                sb.append(random.nextInt(10));
        }
        return sb.toString();


    }

}
