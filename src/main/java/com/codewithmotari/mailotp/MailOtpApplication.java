package com.codewithmotari.mailotp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MailOtpApplication {

    public static void main(String[] args) throws IllegalAccessException {
        SpringApplication.run(MailOtpApplication.class, args);
        System.out.println("the otp is :"+new OTP().generateOTP(7));
        System.out.println("the second otp is :" +new OTP(7));
    }

}
